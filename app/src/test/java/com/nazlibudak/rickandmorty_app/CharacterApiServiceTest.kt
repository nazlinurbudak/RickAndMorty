package com.nazlibudak.rickandmorty_app

import com.nazlibudak.rickandmorty_app.models.CharacterResponse
import com.nazlibudak.rickandmorty_app.services.CharacterApiInterface
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.`when`
import org.mockito.kotlin.mock
import retrofit2.Call

class CharacterApiServiceTest {

    private lateinit var characterApiService: CharacterApiInterface

    private val mockResponse: Call<CharacterResponse> = mock()

    @Before
    fun setUp() {
        characterApiService = mock()
    }

    @Test

    fun `getCharacter is called, it should return the expected response`() {
        runBlocking {
            `when`(characterApiService.getCharacters()).thenReturn(mockResponse)

            val result = characterApiService.getCharacters()

            assert(result == mockResponse)
        }

    }
}