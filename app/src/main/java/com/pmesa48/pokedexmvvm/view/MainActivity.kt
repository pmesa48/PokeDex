package com.pmesa48.pokedexmvvm.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.pmesa48.pokedexmvvm.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(
                R.id.main_activity_fragment_container,
                PokemonListFragment.newInstance(),
                PokemonListFragment.TAG
            )
            .commitNowAllowingStateLoss()
    }
}
