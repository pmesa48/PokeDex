package com.pmesa48.pokedexmvvm.view

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.pmesa48.model.model.Pokemon
import com.pmesa48.pokedexmvvm.R

class PokemonListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val mNameTxt by lazy { itemView.findViewById<TextView>(R.id.pokemon_list_view_holder_name) }
    private val mIdTxt by lazy { itemView.findViewById<TextView>(R.id.pokemon_list_view_holder_id) }

    fun bind(pokemon: Pokemon) {
        mNameTxt.text = pokemon.name
        mIdTxt.text = pokemon.id.toString()
    }

}
