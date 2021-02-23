package org.wit.models

interface MovieStore {
    fun findAll() : List<MovieModel>
    fun findById(id: Long) : MovieModel?
    fun create(movie: MovieModel)
}