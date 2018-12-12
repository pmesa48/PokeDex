package com.pmesa48.pokedexmvvm.data.local

import com.pmesa48.model.local.IPokemonListStorage
import com.pmesa48.model.model.Pokemon
import com.pmesa48.pokedexmvvm.data.db.PokemonDatabase
import com.pmesa48.pokedexmvvm.data.entities.PokemonEntity
import io.reactivex.Flowable
import io.reactivex.schedulers.Schedulers

class PokemonListStorage(var mDb: PokemonDatabase) : IPokemonListStorage {

    companion object {
        val TAG = PokemonListStorage::class.java.simpleName
    }

    override fun save(value: List<Pokemon>) {
        mDb.pokemonDao().insertAll(value.map { PokemonEntity(it.id, it.name, it.url) })
    }

    override fun get(): Flowable<List<Pokemon>> =
        mDb.pokemonDao().getAll().subscribeOn(Schedulers.io())

}
