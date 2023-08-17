package com.example.examplepagingwithcompose

import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query


interface GamesApiService {
    @GET("/games?per_page=25")
    suspend fun getData(
        @Header("X-RapidAPI-Key") apiKey: String ="3033c9ef4emsh6b2a9506bab29e0p175ae7jsn6cbb4f96b7a4",
        @Header("X-RapidAPI-Host") host: String="free-nba.p.rapidapi.com",
        @Query("page") pageNumber :Int,
    ): Data
}