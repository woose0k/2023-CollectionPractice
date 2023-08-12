package com.ohgiraffers.section;

import com.ohgiraffers.common.CategoryAndPokeBoxDTO;
import com.ohgiraffers.common.PokeBoxDTO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuController {

    private final MenuService menuService;
    private final PrintResult printResult;

    public MenuController() {
        menuService = new MenuService();
        printResult = new PrintResult();
    }

    public void selectAllPokemon() {

        List<PokeBoxDTO> pokeList = menuService.selectAllPokemon();

        if (pokeList != null) {
            printResult.printPokeboxList(pokeList);
        } else {
            printResult.printErrorMessage("selectAllList");
        }
    }

    public void searchListByTypeName(Map<String, String> parameter) {

        String type = parameter.get("type");

        List<CategoryAndPokeBoxDTO> pokeBoxAndCategoryList = menuService.searchListByTypeName(type);

        int result = pokeBoxAndCategoryList.size();

        if (result > 0) {
            printResult.printSuccessMessage("searchByTypeName");
        } else {
            printResult.printErrorMessage("searchByTypeName");
        }
    }

    public void searchPokemonByName(Map<String, String> parameter) {

        String name = parameter.get("name");

        List<PokeBoxDTO> pokeBoxList = menuService.searchPokemonByName(name);

        int result = pokeBoxList.size();

        if (result > 0) {
            printResult.printSuccessMessage("searchByPokemonName");
        } else {
            printResult.printErrorMessage("searchByPokemonName");
        }
    }



    public void bringRandomPokemon(List<Integer> randomPokemon) {

        Map<String, List<Integer>> random = new HashMap<>();
        random.put("randomPokemon", randomPokemon);
        List<PokeBoxDTO> list = menuService.bringRandomPokemon(random);

        int result = list.size();

        if (list != null && result > 0) {
            printResult.printSuccessMessage("randomPick");
        } else {
            printResult.printErrorMessage("randomPick");
        }
    }

    public void registNewPokemon(Map<String, String> parameter) {

        String name = parameter.get("name");
        int typeCode = Integer.parseInt(parameter.get("typeCode"));
        String available = parameter.get("available");

        PokeBoxDTO pokeBox = new PokeBoxDTO();
        pokeBox.setName(name);
        pokeBox.setTypeCode(typeCode);
        pokeBox.setEvolveableStatus(available);

        if (menuService.registNewPokemon(pokeBox)) {
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }

    }

    public void modifyPokemon(Map<String, String> parameter) {

        int no = Integer.parseInt(parameter.get("no"));
        String name = parameter.get("name");
        int typeCode = Integer.parseInt(parameter.get("typeCode"));
        String available = parameter.get("available");

        PokeBoxDTO pokeBox = new PokeBoxDTO();
        pokeBox.setNo(no);
        pokeBox.setName(name);
        pokeBox.setTypeCode(typeCode);
        pokeBox.setEvolveableStatus(available);

        if (menuService.modifyPokemon(pokeBox)) {
            printResult.printSuccessMessage("modify");
        } else {
            printResult.printErrorMessage("modify");
        }

    }

    public void transferPokemon(Map<String, String> parameter) {

        int no = Integer.parseInt(parameter.get("no"));

        PokeBoxDTO pokeBox = new PokeBoxDTO();
        pokeBox.setNo(no);

        if (menuService.transferPokemon(pokeBox)) {
            printResult.printSuccessMessage("transfer");
        } else {
            printResult.printErrorMessage("transfer");
        }
    }


}
