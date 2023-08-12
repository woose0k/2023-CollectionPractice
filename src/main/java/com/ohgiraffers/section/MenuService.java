package com.ohgiraffers.section;

import com.ohgiraffers.common.CategoryAndPokeBoxDTO;
import com.ohgiraffers.common.PokeBoxDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.ohgiraffers.common.Template.getSqlSession;

public class MenuService {

    private PokemonSqlMapper mapper;
    public List<PokeBoxDTO> selectAllPokemon() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(PokemonSqlMapper.class);

        List<PokeBoxDTO> pokeList = mapper.selectAllPokemon();

        sqlSession.close();

        return pokeList;
    }


    public List<CategoryAndPokeBoxDTO> searchListByTypeName(String type) {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(PokemonSqlMapper.class);

        List<CategoryAndPokeBoxDTO> pokeBoxAndCategoryList = mapper.searchListByTypeName(type);
        pokeBoxAndCategoryList.forEach(System.out::println);

        sqlSession.close();

        return pokeBoxAndCategoryList;
    }

    public List<PokeBoxDTO> searchPokemonByName(String name) {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(PokemonSqlMapper.class);

        List<PokeBoxDTO> pokeBoxList = mapper.searchPokemonByName(name);
        pokeBoxList.forEach(System.out::println);

        sqlSession.close();

        return pokeBoxList;
    }

    public List<PokeBoxDTO> bringRandomPokemon(Map<String, List<Integer>> random) {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(PokemonSqlMapper.class);

        List<PokeBoxDTO> pokeBoxList = mapper.bringRandomPokemon(random);
        pokeBoxList.forEach(System.out::println);

        sqlSession.close();

        return pokeBoxList;
    }

    public boolean registNewPokemon(PokeBoxDTO pokeBox) {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(PokemonSqlMapper.class);

        int result = mapper.registNewPokemon(pokeBox);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0;
    }


    public boolean modifyPokemon(PokeBoxDTO pokeBox) {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(PokemonSqlMapper.class);

        int result = mapper.modifyPokemon(pokeBox);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0;
    }

    public boolean transferPokemon(PokeBoxDTO pokeBox) {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(PokemonSqlMapper.class);

        int result = mapper.transferPokemon(pokeBox);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0;
    }


}

