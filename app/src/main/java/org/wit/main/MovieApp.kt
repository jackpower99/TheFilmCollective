package org.wit.main

import android.app.Application
import android.util.Log
import org.wit.models.MovieMemStore
import org.wit.models.MovieStore

class MovieApp : Application() {

    lateinit var moviesStore: MovieStore

    override fun onCreate() {
        super.onCreate()
        moviesStore = MovieMemStore()
        Log.v("Donate","Movie App Starting")
    }

}