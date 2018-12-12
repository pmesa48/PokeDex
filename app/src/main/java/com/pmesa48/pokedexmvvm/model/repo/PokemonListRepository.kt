package com.pmesa48.pokedexmvvm.model.repo

import android.annotation.SuppressLint
import android.util.Log
import com.pmesa48.model.local.IPokemonListStorage
import com.pmesa48.model.model.Pokemon
import com.pmesa48.model.remote.PokemonApi
import io.reactivex.Observable
import io.reactivex.rxkotlin.toObservable
import io.reactivex.schedulers.Schedulers

/**
 * @author <a href="pmesa@clickdelivery.com">Pablo Mesa</a>
 * @since 12/6/18
 */
class PokemonListRepository(
    val mApi: PokemonApi,
    val mCache: IPokemonListStorage
) : IPokemonListRepository {

    companion object {
        val TAG = PokemonListRepository::class.java.simpleName
    }

    override fun get(): Observable<List<Pokemon>> {
        return Observable.concatArray(getPokemonFromDb(), getPokemonFromApi())
    }

    private fun getPokemonFromApi(): Observable<List<Pokemon>> = mApi.fetchAll().doOnNext { storePokemonInDb(it) }

    @SuppressLint("CheckResult")
    private fun storePokemonInDb(pokemonList: List<Pokemon>?) {
        Observable.fromCallable { mCache.save(pokemonList!!) }
            ?.subscribeOn(Schedulers.io())
            ?.observeOn(Schedulers.io())?.subscribe {
                Log.d(TAG, "Inserted ${pokemonList!!.size} users from API in DB...")
            }
    }


    private fun getPokemonFromDb(): Observable<List<Pokemon>> {
        return mCache.get().toObservable()
    }

}

