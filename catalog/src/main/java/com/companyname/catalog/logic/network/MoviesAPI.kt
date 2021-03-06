package com.companyname.catalog.logic.network

import com.companyname.repository.net.entities.MoviesTop
import retrofit2.http.GET
import retrofit2.http.Query

interface MoviesAPI {

    @GET("discover/movie")
    suspend fun getMovies(@Query("page") page: Int): MoviesTop
}