package com.pmesa48.pokedexmvvm.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.util.Log
import com.pmesa48.model.model.Pokemon
import com.pmesa48.pokedexmvvm.model.repo.IPokemonListRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class PokemonListViewModel(private val mPokemonRepo: IPokemonListRepository) : ViewModel() {

    var mPokemonList: MutableLiveData<List<Pokemon>> = MutableLiveData()

    private val disposables = CompositeDisposable()

    fun get() {
        disposables.add(
            mPokemonRepo.get().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ mPokemonList.value = it }
                    , { Log.d("Shit", it.message) })
        )
    }
}
