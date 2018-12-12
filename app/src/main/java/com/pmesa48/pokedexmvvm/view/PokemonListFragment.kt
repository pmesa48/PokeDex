package com.pmesa48.pokedexmvvm.view

import android.arch.lifecycle.Observer
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pmesa48.pokedexmvvm.R
import com.pmesa48.pokedexmvvm.viewmodel.PokemonListViewModel
import kotlinx.android.synthetic.main.pokemon_list_fragment.*
import org.koin.android.viewmodel.ext.android.viewModel


class PokemonListFragment : Fragment() {

    private val viewModel by viewModel<PokemonListViewModel>()

    companion object {
        val TAG: String = PokemonListFragment::class.java.simpleName

        fun newInstance() = PokemonListFragment()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.pokemon_list_fragment, container, false)


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        pokemon_list_recycler_view.layoutManager = LinearLayoutManager(context)
        viewModel.get()
        viewModel.mPokemonList.observe(this, Observer {
            pokemon_list_recycler_view.adapter = PokemonListAdapter(it!!)
        })
    }

}
