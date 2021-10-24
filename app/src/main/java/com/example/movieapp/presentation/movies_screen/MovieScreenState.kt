package com.example.movieapp.presentation.movies_screen

import com.example.movieapp.models.Movie

data class MovieScreenState(
    val isLoading: Boolean = false,
    val data: List<Movie> = emptyList(),
    val error: String? = null
)