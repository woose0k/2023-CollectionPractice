package com.ohgiraffers.section;

public class CategoryDTO {

    private int typeCode;
    private String typeName;
    private int refCode;

    public CategoryDTO() {
    }

    public CategoryDTO(int typeCode, String typeName, int refCode) {
        this.typeCode = typeCode;
        this.typeName = typeName;
        this.refCode = refCode;
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

    public int getRefCode() {
        return refCode;
    }

    public void setRefCode(int refCode) {
        this.refCode = refCode;
    }

    @Override
    public String toString() {
        return "CategoryDTO{" +
                "typeCode=" + typeCode +
                ", typeName='" + typeName + '\'' +
                ", refCode=" + refCode +
                '}';
    }
}
