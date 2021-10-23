package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.adapters.PokemonAdapter
import com.example.models.Pokemon
import java.util.ArrayList

class PokemonActivity : AppCompatActivity() {
    private lateinit var myAdapter : PokemonAdapter
    private lateinit var recyclerView : RecyclerView
    private lateinit var pokemonList : MutableList<Pokemon>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon)

        recyclerView =findViewById(R.id.pokemonRecyclerView)

        initRecyclerView()

    }

    private fun initRecyclerView() {
        pokemonList = ArrayList()
        pokemonList.add(Pokemon("Bulbasaur","https://raw.githubusercontent.com/fanzeyi/pokemon.json/master/images/001.png"))
        pokemonList.add(Pokemon("Ivysaur","https://raw.githubusercontent.com/fanzeyi/pokemon.json/master/images/002.png"))
        pokemonList.add(Pokemon("Venusaur","https://raw.githubusercontent.com/fanzeyi/pokemon.json/master/images/003.png"))
        pokemonList.add(Pokemon("Charmander","https://raw.githubusercontent.com/fanzeyi/pokemon.json/master/images/004.png"))
        pokemonList.add(Pokemon("Charmeleon","https://raw.githubusercontent.com/fanzeyi/pokemon.json/master/images/005.png"))
        pokemonList.add(Pokemon("Charizard","https://raw.githubusercontent.com/fanzeyi/pokemon.json/master/images/006.png"))
        pokemonList.add(Pokemon("Squirtle","https://raw.githubusercontent.com/fanzeyi/pokemon.json/master/images/007.png"))
        pokemonList.add(Pokemon("Wartortle","https://raw.githubusercontent.com/fanzeyi/pokemon.json/master/images/008.png"))
        pokemonList.add(Pokemon("Blastoise","https://raw.githubusercontent.com/fanzeyi/pokemon.json/master/images/009.png"))
        pokemonList.add(Pokemon("Caterpie","https://raw.githubusercontent.com/fanzeyi/pokemon.json/master/images/010.png"))
        pokemonList.add(Pokemon("Metapod","https://raw.githubusercontent.com/fanzeyi/pokemon.json/master/images/011.png"))
        pokemonList.add(Pokemon("Butterfree","https://raw.githubusercontent.com/fanzeyi/pokemon.json/master/images/012.png"))
        pokemonList.add(Pokemon("Weedle","https://raw.githubusercontent.com/fanzeyi/pokemon.json/master/images/013.png"))
        pokemonList.add(Pokemon("Kakuna","https://raw.githubusercontent.com/fanzeyi/pokemon.json/master/images/014.png"))
        pokemonList.add(Pokemon("Beedrill","https://raw.githubusercontent.com/fanzeyi/pokemon.json/master/images/015.png"))
        pokemonList.add(Pokemon("Pidgey","https://raw.githubusercontent.com/fanzeyi/pokemon.json/master/images/016.png"))
        pokemonList.add(Pokemon("Pidgeotto","https://raw.githubusercontent.com/fanzeyi/pokemon.json/master/images/017.png"))
        pokemonList.add(Pokemon("Pidgeot","https://raw.githubusercontent.com/fanzeyi/pokemon.json/master/images/018.png"))
        pokemonList.add(Pokemon("Rattata","https://raw.githubusercontent.com/fanzeyi/pokemon.json/master/images/019.png"))
        pokemonList.add(Pokemon("Raticate","https://raw.githubusercontent.com/fanzeyi/pokemon.json/master/images/020.png"))
        pokemonList.add(Pokemon("Spearow","https://raw.githubusercontent.com/fanzeyi/pokemon.json/master/images/021.png"))
        pokemonList.add(Pokemon("Fearow","https://raw.githubusercontent.com/fanzeyi/pokemon.json/master/images/022.png"))
        pokemonList.add(Pokemon("Ekans","https://raw.githubusercontent.com/fanzeyi/pokemon.json/master/images/023.png"))
        pokemonList.add(Pokemon("Arbok","https://raw.githubusercontent.com/fanzeyi/pokemon.json/master/images/024.png"))
        pokemonList.add(Pokemon("Pikachu","https://raw.githubusercontent.com/fanzeyi/pokemon.json/master/images/025.png"))
        pokemonList.add(Pokemon("Raichu","https://raw.githubusercontent.com/fanzeyi/pokemon.json/master/images/026.png"))
        pokemonList.add(Pokemon("Sandshrew","https://raw.githubusercontent.com/fanzeyi/pokemon.json/master/images/027.png"))


        myAdapter = PokemonAdapter(this, pokemonList)
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerView.adapter = myAdapter
    }
}