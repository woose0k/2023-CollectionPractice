package com.ohgiraffers.section;

import com.ohgiraffers.common.PokeBoxDTO;

import java.util.List;

public class PrintResult {
    public void printPokeboxList(List<PokeBoxDTO> pokeList) {
      pokeList.forEach(System.out::println);
    }

    public void printErrorMessage(String errorCode) {

        String errormessage = "";
        switch (errorCode) {
            case "selectAllList" : errormessage = "전체 조회에 실패하였습니다."; break;
            case "searchByTypeName" : errormessage = "속성이름 조회에 실패하였습니다."; break;
            case "searchByPokemonName" : errormessage = "포켓몬 이름 조회에 실패하였습니다."; break;
            case "randomPick" : errormessage = "랜덤불러오기에 실패하였습니다."; break;
            case "insert" : errormessage = "새 등록에 실패하였습니다."; break;
            case "modify" : errormessage = "변경에 실패하였습니다."; break;
            case "transfer" : errormessage = "내보내는데 실패하였습니다."; break;
        }
        System.out.println(errormessage);
    }

    public void printSuccessMessage(String successCode) {

        String successMessage = "";
        switch (successCode) {
            case "searchByTypeName" : successMessage = "속성이름 조회에 성공했습니다."; break;
            case "searchByPokemonName" : successMessage = "포켓몬이름 조회에 성공했습니다."; break;
            case "randomPick" : successMessage = "랜덤불러오기에 성공했습니다."; break;
            case "insert" : successMessage = "새 포켓몬등록에 성공했습니다."; break;
            case "modify" : successMessage = "정보수정에 성공했습니다."; break;
            case "transfer" : successMessage = "내보내는데 성공했습니다."; break;
        }
        System.out.println(successMessage);
    }
}
