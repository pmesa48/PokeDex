package com.pmesa48.model.remote

import com.pmesa48.model.model.Pokemon
import io.reactivex.Observable

interface PokemonApi {

    fun fetchAll(): Observable<List<Pokemon>>
}
