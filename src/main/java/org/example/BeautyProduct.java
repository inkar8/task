package com.beauty.models;

public class BeautyProduct {
    private final String name;
    private final String description;

    public BeautyProduct(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

