package com.example.examplepagingwithcompose

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object DependencyContainer {
    val apiService: GamesApiService = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("https://free-nba.p.rapidapi.com")
        .build().create(GamesApiService::class.java)
}