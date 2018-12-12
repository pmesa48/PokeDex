package com.pmesa48.pokedexmvvm.view

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.pmesa48.model.model.Pokemon
import com.pmesa48.pokedexmvvm.R

class PokemonListAdapter(private val itemList: List<Pokemon>) : RecyclerView.Adapter<PokemonListViewHolder>() {

    override fun onCreateViewHolder(container: ViewGroup, type: Int) =
        container.inflate(R.layout.pokemon_list_view_holder)

    override fun getItemCount(): Int = itemList.size

    override fun onBindViewHolder(holder: PokemonListViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

}
