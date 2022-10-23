package com.nazlibudak.rickandmorty_app.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nazlibudak.rickandmorty_app.data.CharacterRepository
import com.nazlibudak.rickandmorty_app.data.Character


class CharacterViewModel: ViewModel() {

    private val characterRepository = CharacterRepository()

    var characterList = MutableLiveData<List<Character>>()

    init {
        characters()
    }

    private fun characters() {
        characterRepository.getCharacters { characters ->
            characterList.value = characters
        }
    }
}