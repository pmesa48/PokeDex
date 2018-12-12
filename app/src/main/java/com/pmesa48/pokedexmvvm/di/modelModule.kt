package com.pmesa48.pokedexmvvm.di

import com.pmesa48.pokedexmvvm.model.repo.IPokemonListRepository
import com.pmesa48.pokedexmvvm.model.repo.PokemonListRepository
import org.koin.dsl.module.module

/**
 * @author <a href="pmesa@clickdelivery.com">Pablo Mesa</a>
 * @since 12/11/18
 */
val modelModule = module {
    factory<IPokemonListRepository> { PokemonListRepository(get(), get()) }
}