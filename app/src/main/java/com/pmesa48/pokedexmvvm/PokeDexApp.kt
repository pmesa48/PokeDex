package com.pmesa48.pokedexmvvm

import android.app.Application
import com.facebook.stetho.Stetho
import com.pmesa48.pokedexmvvm.di.*
import org.koin.android.ext.android.startKoin

/**
 * @author <a href="pmesa@clickdelivery.com">Pablo Mesa</a>
 * @since 12/11/18
 */
class PokeDexApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(appModule, modelModule, networkModule, viewModelModule, persistenceModule))
        Stetho.initializeWithDefaults(this)
    }
}