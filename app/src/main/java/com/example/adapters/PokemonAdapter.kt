package com.example.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.models.Pokemon
import com.example.myapplication.R
import com.example.utils.inflate

class PokemonAdapter(
    private val context: Context,
    private val pokemonList : MutableList<Pokemon>
) : RecyclerView.Adapter<PokemonViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        PokemonViewHolder(parent.inflate(R.layout.pokemon_sample_layout))

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {

        val myData = pokemonList[position]

        val requestOptions = RequestOptions()
            .placeholder(R.drawable.ic_recycler_view_place_holder)

            .error(R.drawable.ic_launcher_background)



        Glide.with(holder.imagePoke.context)
            .applyDefaultRequestOptions(requestOptions)
            .load(myData.image)
            .into(holder.imagePoke)
        holder.namePoke.text=myData.name
    }

    override fun getItemCount() : Int{
        return pokemonList.size
    }

}


class PokemonViewHolder(itemView : View):RecyclerView.ViewHolder(itemView){
    val imagePoke : ImageView = itemView.findViewById(R.id.pokemonImageView)
    val namePoke : TextView = itemView.findViewById(R.id.pokemonName)
}