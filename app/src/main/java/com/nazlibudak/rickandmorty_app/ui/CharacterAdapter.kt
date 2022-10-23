package com.nazlibudak.rickandmorty_app.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nazlibudak.rickandmorty_app.R
import com.nazlibudak.rickandmorty_app.data.Character
import kotlinx.android.synthetic.main.character_item.view.*

class CharacterAdapter(
    private val characters : List<Character>
) : RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder>(){

    class CharacterViewHolder(view:View) : RecyclerView.ViewHolder(view){


        fun bindCharacter(character : Character) {
            itemView.character_name.text = character.name
            Glide.with(itemView).load(character.image).into(itemView.character_image)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        return CharacterViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.character_item,
                parent, false)
        )
    }

    override fun getItemCount(): Int = characters.size

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        holder.bindCharacter(characters.get(position))
    }



}