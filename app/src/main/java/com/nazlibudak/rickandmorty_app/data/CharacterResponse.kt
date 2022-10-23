package com.nazlibudak.rickandmorty_app.models


import com.google.gson.annotations.SerializedName
import com.nazlibudak.rickandmorty_app.data.Character

data class CharacterResponse(
    @SerializedName("results")
    val characters: List<Character>
)