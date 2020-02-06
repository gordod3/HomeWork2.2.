package com.company;

public class Mammals extends Animal {
    private String eat;

    public Mammals(String eat) {
        this.eat = eat;
    }

    @Override
    public String print() {
        return getClass().getSimpleName() + " eating - " + eat;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }
}
