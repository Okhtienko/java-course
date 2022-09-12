package com.it.technology.lesson9.enums;

public enum VectorType {
    TWO_DIMENSIONAL_VECTOR("1"),
    THREE_DIMENSIONAL_VECTOR("2"),
    VECTOR("3");

    private String type;

    VectorType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static VectorType getEnum(String value) {
        for(VectorType v : values()) {
            if(v.getType().equalsIgnoreCase(value)) {
                return v;
            }
        } throw new IllegalArgumentException();
    }
}
