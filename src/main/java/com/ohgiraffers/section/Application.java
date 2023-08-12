package com.ohgiraffers.section;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuController menuController = new MenuController();

        do {
            System.out.println("======== 포켓몬 관리 메뉴 ========");
            System.out.println("1. 모든 포켓몬 조회");
            System.out.println("2. 원하는 옵션으로 선택 조회");
            System.out.println("3. 포켓몬 추가 등록");
            System.out.println("4. 포켓몬 정보 수정");
            System.out.println("5. 포켓몬 내보내기");
            System.out.println("9. 종료하기");
            System.out.print("메뉴 관리 번호 입력 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : menuController.selectAllPokemon(); break;
                case 2 : selectMenuByOption(); break;
                case 3 : menuController.registNewPokemon(inputPokebox()); break;
                case 4 : menuController.modifyPokemon(inputmodifyPokeBox()); break;
                case 5 : menuController.transferPokemon(inputTransferPokemon()); break;
                case 9 : return;
            }
        } while (true);
    }


    private static void selectMenuByOption() {

        Scanner sc = new Scanner(System.in);
        MenuController menuController = new MenuController();

        do {
            System.out.println("========= 조회 옵션 선택 메뉴 ========");
            System.out.println("1. 포켓몬타입으로 전체 조회");
            System.out.println("2. 포켓몬이름으로 조회(한 단어도 가능)");
            System.out.println("3. 랜덤 포켓몬 데려오기");
            System.out.println("9. 이전 메뉴");
            System.out.print("메뉴 번호를 입력 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : menuController.searchListByTypeName(inputTypeName()); break;
                case 2 : menuController.searchPokemonByName(inputName()); break;
                case 3 : menuController.bringRandomThreePokemon(randomPokemonList()); break;
                case 9 : return;
            }

        } while (true);

    }


    private static Map<String, String> inputTypeName() {

        Scanner sc = new Scanner(System.in);
        System.out.print("포켓몬타입 입력 : ");
        String type = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("type", type);

        return parameter;
    }

    private static Map<String, String> inputName() {

        Scanner sc = new Scanner(System.in);
        System.out.print("포켓몬이름 입력 : ");
        String name = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("name", name);

        return parameter;
    }

    private static List<Integer> randomPokemonList() {

        Set<Integer> set = new HashSet<>();
        while (set.size() < 3) {
            int temp = ((int) (Math.random() * 30)) + 1;
            set.add(temp);
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        return list;
    }


    private static Map<String, String> inputPokebox() {

        Scanner sc = new Scanner(System.in);
        System.out.print("포켓몬 이름 입력 : ");
        String name = sc.nextLine();
        System.out.print("포켓몬 속성 번호 입력 : ");
        String typeCode = sc.nextLine();
        System.out.print("진화 가능 여부 입력(Y/N) : ");
        String available = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("name", name);
        parameter.put("typeCode", typeCode);
        parameter.put("available", available);

        return parameter;
    }

    private static Map<String, String> inputmodifyPokeBox() {

        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 포켓몬 번호 입력 : ");
        String no = sc.nextLine();
        System.out.print("수정할 포켓몬 이름 입력 : ");
        String name = sc.nextLine();
        System.out.print("속성 번호 입력 : ");
        String typeCode = sc.nextLine();
        System.out.print("진화 가능 여부 입력(Y/N) : ");
        String available = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("no", no);
        parameter.put("name", name);
        parameter.put("typeCode", typeCode);
        parameter.put("available", available);

        return parameter;

    }


    private static Map<String, String> inputTransferPokemon() {

        Scanner sc = new Scanner(System.in);
        System.out.print("내보낼 포켓몬 번호 입력 : ");
        String no = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("no", no);

        return parameter;
    }

}
