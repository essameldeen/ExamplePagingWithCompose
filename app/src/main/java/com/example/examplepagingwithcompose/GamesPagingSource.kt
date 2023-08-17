package com.example.examplepagingwithcompose

import androidx.paging.PagingSource
import androidx.paging.PagingState


class  GamesPagingSource(

    private val apiService: GamesApiService = DependencyContainer.apiService
):PagingSource<Int,Game>(){
    override fun getRefreshKey(state: PagingState<Int, Game>): Int? {
        TODO("Not yet implemented")
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Game> {
        TODO("Not yet implemented")
    }

}