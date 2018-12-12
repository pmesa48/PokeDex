package com.pmesa48.pokedexmvvm.data.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * @author <a href="pmesa@clickdelivery.com">Pablo Mesa</a>
 * @since 12/11/18
 */
@Entity
data class PokemonEntity(
    val id: Int,
    @PrimaryKey
    val name: String,
    val url: String
)