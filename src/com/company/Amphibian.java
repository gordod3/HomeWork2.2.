package com.company;

public class Amphibian extends Animal {
    private String name;

    public Amphibian(String name) {
        this.name = name;
    }

    @Override
    public String print() {
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
