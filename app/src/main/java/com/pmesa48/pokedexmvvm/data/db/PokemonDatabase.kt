package com.pmesa48.pokedexmvvm.data.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.pmesa48.pokedexmvvm.data.dao.PokemonDao
import com.pmesa48.pokedexmvvm.data.entities.PokemonEntity

/**
 * @author <a href="pmesa@clickdelivery.com">Pablo Mesa</a>
 * @since 12/11/18
 */
@Database(entities = [PokemonEntity::class], version = 1, exportSchema = false)
abstract class PokemonDatabase : RoomDatabase() {
    abstract fun pokemonDao(): PokemonDao
}