package com.nazlibudak.rickandmorty_app.ui

import  androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.nazlibudak.rickandmorty_app.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val viewModel by viewModels<CharacterViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_characters_list.layoutManager = LinearLayoutManager(this)
        rv_characters_list.setHasFixedSize(true)
        viewModel.characterList.observe(this, Observer { characters ->
            rv_characters_list.adapter = CharacterAdapter(characters)
        })
    }
}