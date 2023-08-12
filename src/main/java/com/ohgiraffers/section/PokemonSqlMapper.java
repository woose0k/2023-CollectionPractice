package com.ohgiraffers.section;

import com.ohgiraffers.common.CategoryAndPokeBoxDTO;
import com.ohgiraffers.common.PokeBoxDTO;

import java.util.List;
import java.util.Map;

public interface PokemonSqlMapper {
    List<PokeBoxDTO> selectAllPokemon();


    int registNewPokemon(PokeBoxDTO pokeBox);

    int modifyPokemon(PokeBoxDTO pokeBox);

    int transferPokemon(PokeBoxDTO pokeBox);

    List<CategoryAndPokeBoxDTO> searchListByTypeName(String type);

    List<PokeBoxDTO> searchPokemonByName(String name);

    List<PokeBoxDTO> bringRandomThreePokemon(Map<String, List<Integer>> random);
}
