package com.example.movieapp.repositories

import com.example.movieapp.db.MovieDao
import com.example.movieapp.models.Movie
import javax.inject.Inject

class SavedMovieRepoImpl @Inject constructor(
    private val dao: MovieDao
) : SavedMovieRepository {
    override fun getAllMovies(): List<Movie> {
        return dao.getMovies()
    }

    override suspend fun addMovie(movie: Movie) {
        dao.addMovie(movie)
    }

    override fun isMovieSaved(id: Int): Boolean {
        return dao.isMovieSaved(id)
    }

    override suspend fun removeMovie(id: Int) {
        return dao.removeMovieById(id)
    }
}