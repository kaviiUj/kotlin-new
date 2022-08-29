package com.example.kotlin1.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object APIClient {

    const val BASE_URL2: String = "https://fxposqaapi.azurewebsites.net/api/"
    const val BaseUrl: String = "https://api.imgflip.com/"

    fun getInstance(): Retrofit {
        return Retrofit.Builder()
            .baseUrl((BASE_URL2))
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getInstance_new(): Retrofit {
        return Retrofit.Builder()
            .baseUrl((BaseUrl))
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}