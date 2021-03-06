package com.example.continuadadois

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Conexao {

    fun criar(): MetodosAPI {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://5f861cfdc8a16a0016e6aacd.mockapi.io/bandtec-api/ ")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val api = retrofit.create(MetodosAPI::class.java)

        return api
    }
}