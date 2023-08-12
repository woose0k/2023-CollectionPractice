package com.ohgiraffers.common;

import java.util.List;

public class CategoryAndPokeBoxDTO {

    private int typeCode;
    private String typeName;
    private List<PokeBoxDTO> pokeBoxList;

    public CategoryAndPokeBoxDTO() {
    }

    public CategoryAndPokeBoxDTO(int typeCode, String typeName, List<PokeBoxDTO> pokeBoxList) {
        this.typeCode = typeCode;
        this.typeName = typeName;
        this.pokeBoxList = pokeBoxList;
    }

    public int getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(int typeCode) {
        this.typeCode = typeCode;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public List<PokeBoxDTO> getPokeBoxList() {
        return pokeBoxList;
    }

    public void setPokeBoxList(List<PokeBoxDTO> pokeBoxList) {
        this.pokeBoxList = pokeBoxList;
    }

    @Override
    public String toString() {
        return "CategoryAndPokeBoxDTO{" +
                "typeCode=" + typeCode +
                ", typeName='" + typeName + '\'' +
                ", pokeBoxList=" + pokeBoxList +
                '}';
    }
}
