package com.pmesa48.model.remote

import io.reactivex.Observable
import retrofit2.http.GET

/**
 * @author <a href="pmesa@clickdelivery.com">Pablo Mesa</a>
 * @since 12/6/18
 */
interface PokemonApiServices {

    @GET("pokemon/")
    fun fetchAll(): Observable<PokemonListDto>
}