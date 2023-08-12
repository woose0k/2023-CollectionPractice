package com.ohgiraffers.common;

public class CategoryDTO {

    private int typeCode;
    private String typeName;

    public CategoryDTO() {
    }

    public CategoryDTO(int typeCode, String typeName) {
        this.typeCode = typeCode;
        this.typeName = typeName;

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

    @Override
    public String toString() {
        return "CategoryDTO{" +
                "typeCode=" + typeCode +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
