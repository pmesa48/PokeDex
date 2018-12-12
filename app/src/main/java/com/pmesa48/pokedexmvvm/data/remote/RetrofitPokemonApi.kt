package com.pmesa48.model.remote

import com.pmesa48.model.model.Pokemon
import io.reactivex.Observable
import retrofit2.Retrofit

/**
 * @author <a href="pmesa@clickdelivery.com">Pablo Mesa</a>
 * @since 12/6/18
 */
class RetrofitPokemonApi(retrofit: Retrofit) : PokemonApi {

    private val mServices: PokemonApiServices = retrofit.create(PokemonApiServices::class.java)

    override fun fetchAll(): Observable<List<Pokemon>> = mServices.fetchAll().map { it.results }

}