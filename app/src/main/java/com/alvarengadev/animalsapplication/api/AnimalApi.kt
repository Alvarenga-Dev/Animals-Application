package com.alvarengadev.animalsapplication.api

import com.alvarengadev.animalsapplication.model.Animal
import retrofit2.http.GET

interface AnimalApi {

    @GET("animals.json")
    suspend fun getAnimals(): List<Animal>
}
