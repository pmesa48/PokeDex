package com.pmesa48.pokedexmvvm.di

import com.pmesa48.pokedexmvvm.viewmodel.PokemonListViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

/**
 * @author <a href="pmesa@clickdelivery.com">Pablo Mesa</a>
 * @since 12/11/18
 */
val viewModelModule = module {
    viewModel { PokemonListViewModel(get()) }
}