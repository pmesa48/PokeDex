package com.pmesa48.pokedexmvvm.data.dao

import android.arch.persistence.room.*
import com.pmesa48.pokedexmvvm.data.entities.PokemonEntity
import io.reactivex.Maybe

/**
 * @author <a href="pmesa@clickdelivery.com">Pablo Mesa</a>
 * @since 12/11/18
 */
@Dao
interface PokemonDao {
    @Insert
    fun insertOnly(pokemon: PokemonEntity)

    @Insert
    fun insertAll(pokemonList: List<PokemonEntity>)

    @Query("SELECT * FROM PokemonEntity WHERE name= :name")
    fun findPokemonByName(name: String): PokemonEntity

    @Update
    fun updatePokemon(pokemon: PokemonEntity)

    @Delete
    fun deletePokemon(pokemon: PokemonEntity)

    @Query("SELECT * FROM PokemonEntity")
    fun getAll(): Maybe<List<PokemonEntity>>
}