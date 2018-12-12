package com.pmesa48.pokedexmvvm.di

import com.pmesa48.model.remote.PokemonApi
import com.pmesa48.model.remote.RetrofitPokemonApi
import org.koin.dsl.module.module

/**
 * @author <a href="pmesa@clickdelivery.com">Pablo Mesa</a>
 * @since 12/11/18
 */
val networkModule = module {
    factory<PokemonApi> { RetrofitPokemonApi(get()) }
}