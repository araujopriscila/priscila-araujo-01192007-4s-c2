package com.example.continuadadois

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.Call

interface MetodosAPI {

    @GET("cachorros/{id}")
    fun get(@Path("id") id:Int):
            Call<DadosAPI>
}