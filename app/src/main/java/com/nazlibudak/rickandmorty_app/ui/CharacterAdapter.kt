package com.nazlibudak.rickandmorty_app.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nazlibudak.rickandmorty_app.data.Character
import com.nazlibudak.rickandmorty_app.databinding.CharacterItemBinding

class CharacterAdapter(
    private var characters: List<Character>
) : RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder>() {


    class CharacterViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding = CharacterItemBinding.bind(view)

        fun bind(character: Character) {
            binding.characterName.text = character.name
            Glide.with(binding.root.context).load(character.image).into(binding.characterImage)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val binding =
            CharacterItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CharacterViewHolder(binding.root)

    }

    fun updateList(character: List<Character>) {
        this.characters = character
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = characters.size

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        val currentItem = characters[position]
        holder.bind(currentItem)

    }


}