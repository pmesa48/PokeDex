package com.pmesa48.pokedexmvvm.view

import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.ViewGroup

/**
 * @author <a href="pmesa@clickdelivery.com">Pablo Mesa</a>
 * @since 12/6/18
 */
fun ViewGroup.inflate(@LayoutRes layout_id: Int) =
    PokemonListViewHolder(LayoutInflater.from(context).inflate(layout_id, this, false))