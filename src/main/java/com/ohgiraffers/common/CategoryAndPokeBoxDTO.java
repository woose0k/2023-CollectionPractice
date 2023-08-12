package com.ohgiraffers.common;

public class PokeBoxAndCategoryDTO {

    private int no;
    private String name;
    private CategoryDTO category;
    private String evolveable;

    public PokeBoxAndCategoryDTO() {
    }

    public PokeBoxAndCategoryDTO(int no, String name, CategoryDTO category, String evolveable) {
        this.no = no;
        this.name = name;
        this.category = category;
        this.evolveable = evolveable;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategoryDTO getCategory() {
        return category;
    }

    public void setCategory(CategoryDTO category) {
        this.category = category;
    }

    public String getEvolveable() {
        return evolveable;
    }

    public void setEvolveable(String evolveable) {
        this.evolveable = evolveable;
    }

    @Override
    public String toString() {
        return "MenuAndCategoryDTO{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", evolveable='" + evolveable + '\'' +
                '}';
    }
}
