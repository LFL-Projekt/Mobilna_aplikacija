package com.example.mobilna_aplikacija_paketnik.API.OpenBox
import com.example.mobilna_aplikacija_paketnik.API.Log.LogItem
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path

interface OpenInterface {
    @POST("Access/openbox")
    @Headers("Content-Type: application/json","Authorization: Bearer 9ea96945-3a37-4638-a5d4-22e89fbc998f")
    suspend fun openBox(@Body request: OpenBoxRequest): OpenBoxResponse




}


