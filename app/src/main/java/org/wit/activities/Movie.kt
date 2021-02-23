package org.wit.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.wit.R
import org.wit.main.MovieApp
import org.wit.models.MovieModel
import java.time.LocalDate

class Movie : AppCompatActivity() {

  lateinit var app: MovieApp

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    app = this.application as MovieApp


    addMovieBtn.setOnClickListener {
      app.moviesStore.create(MovieModel(title = movieTitle.text.toString(), director = movieDirector.text.toString(), releaseDate = movieReleaseDate.text.toString(), earnings = movieEarnings.text.toString().toLong(),
        description = movieDescription.text.toString(), rating = movieRating.rating.toLong()))
    }
  }


}