package com.example.pokedex.Model;

import java.util.List;

public class Pokedex {
    private List<Pokemon> pokemon;

    public Pokedex(){

    }

    public Pokedex(List<Pokemon> pokemon){
        this.pokemon = pokemon;
    }

    public List<Pokemon> getPokemon(){
        return pokemon;
    }

    public void getPokemon(List<Pokemon> pokemon){
        this.pokemon = pokemon;
    }
}