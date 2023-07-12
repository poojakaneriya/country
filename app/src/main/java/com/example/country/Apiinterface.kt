package com.example.country

import android.telecom.Call
import retrofit2.http.GET

class Apiinterface {

    @GET("all")
    fun getcountry(): Call<List<CountryModal>> {
    }
}