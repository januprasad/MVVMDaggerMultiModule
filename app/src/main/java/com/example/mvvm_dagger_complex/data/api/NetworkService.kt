package com.example.mvvm_dagger_complex.data.api

import com.example.mvvm_dagger_complex.AppConstant.API_KEY
import com.example.mvvm_dagger_complex.data.TopHeadlinesResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query
import javax.inject.Singleton

@Singleton
interface NetworkService {

    @Headers("X-Api-Key: $API_KEY")
    @GET("top-headlines")
    suspend fun getTopHeadlines(@Query("country") country: String): TopHeadlinesResponse

}