package com.pmesa48.pokedexmvvm.di

import android.arch.persistence.room.Room
import com.pmesa48.model.local.IPokemonListStorage
import com.pmesa48.pokedexmvvm.data.db.PokemonDatabase
import com.pmesa48.pokedexmvvm.data.local.PokemonListStorage
import org.koin.dsl.module.module

/**
 * @author <a href="pmesa@clickdelivery.com">Pablo Mesa</a>
 * @since 12/11/18
 */
val persistenceModule = module {
    single {
        Room.databaseBuilder(get(), PokemonDatabase::class.java, "pokemon_db")
            .fallbackToDestructiveMigration()
            .build()
    }
    single<IPokemonListStorage> { PokemonListStorage(get()) }
}