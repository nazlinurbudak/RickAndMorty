package com.nazlibudak.rickandmorty_app.data

import com.nazlibudak.rickandmorty_app.models.CharacterResponse
import com.nazlibudak.rickandmorty_app.services.CharacterApiInterface
import com.nazlibudak.rickandmorty_app.services.CharacterApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CharacterRepository {


    fun getCharacters(callback: (List<Character>) -> Unit) {
        val apiService = CharacterApiService.getInstance().create(CharacterApiInterface::class.java)
        apiService.getCharacters().enqueue(object : Callback<CharacterResponse> {

            override fun onFailure(call: Call<CharacterResponse>, t: Throwable) {

            }

            override fun onResponse(call: Call<CharacterResponse>,
                                    response: Response<CharacterResponse>
            ) {
                return callback(response.body()!!.characters)
            }
        })
    }
}