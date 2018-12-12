package com.pmesa48.model.remote

import com.pmesa48.model.model.Pokemon

/**
 * @author <a href="pmesa@clickdelivery.com">Pablo Mesa</a>
 * @since 12/6/18
 */
data class PokemonListDto(
    val count: Int,
    val results: List<Pokemon>
)
