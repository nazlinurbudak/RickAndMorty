package com.nazlibudak.rickandmorty_app.data

import com.google.gson.annotations.SerializedName

data class Character(
    @SerializedName("name")
    val name: String,
    @SerializedName("image")
    val image: String
)

