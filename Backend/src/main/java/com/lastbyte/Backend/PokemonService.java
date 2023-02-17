package com.lastbyte.Backend;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonService {

    @Cacheable("pokemonCache")
    public Pokemon getPokemon(String name) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://pokeapi.co/api/v2/pokemon/" + name;
        Pokemon pokemon = restTemplate.getForObject(url, Pokemon.class);
        return pokemon;
    }
}


