package com.nazlibudak.rickandmorty_app.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.nazlibudak.rickandmorty_app.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel by viewModels<CharacterViewModel>()
    private val adapter by lazy { CharacterAdapter(emptyList()) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvCharactersList.layoutManager = LinearLayoutManager(this)
        binding.rvCharactersList.adapter = adapter

        viewModel.characterList.observe(this) {
            adapter.updateList(it)
        }

    }
}