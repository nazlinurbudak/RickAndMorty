package com.nazlibudak.rickandmorty_app.services

import com.nazlibudak.rickandmorty_app.common.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CharacterApiService {

    companion object{

        private var retrofit : Retrofit? = null

        fun getInstance() : Retrofit{
            if(retrofit == null){
                retrofit = Retrofit.Builder()
                    .baseUrl(Constants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()

            }
            return retrofit!!
        }

    }
}