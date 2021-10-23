package com.example.models

data class Movie(
    val image: String,
    val name: String,
    val imdbRating: Double,
    val yourRating: Double,
    val metaScore: Int,
    var isBookmarked :Boolean
)
