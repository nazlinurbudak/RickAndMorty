package com.nazlibudak.rickandmorty_app.services


import com.nazlibudak.rickandmorty_app.models.CharacterResponse
import retrofit2.Call
import retrofit2.http.GET

interface CharacterApiInterface {
    @GET("rickandmorty.json")
    fun getCharacters(): Call<CharacterResponse>
}