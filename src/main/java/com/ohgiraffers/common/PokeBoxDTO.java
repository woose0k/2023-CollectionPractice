package com.ohgiraffers.section;

public class PokeBoxDTO {

    private int no;
    private String name;
    private int typeCode;
    private String evolveableStatus;

    public PokeBoxDTO() {
    }

    public PokeBoxDTO(int no, String name, int typeCode, String evolveableStatus) {
        this.no = no;
        this.name = name;
        this.typeCode = typeCode;
        this.evolveableStatus = evolveableStatus;
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

    public int getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(int typeCode) {
        this.typeCode = typeCode;
    }

    public String getEvolveableStatus() {
        return evolveableStatus;
    }

    public void setEvolveableStatus(String evolveableStatus) {
        this.evolveableStatus = evolveableStatus;
    }

    @Override
    public String toString() {
        return "PokeBoxDTO{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", typeCode=" + typeCode +
                ", evolveableStatus='" + evolveableStatus + '\'' +
                '}';
    }
}
