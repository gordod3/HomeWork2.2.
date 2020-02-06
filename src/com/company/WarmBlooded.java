package com.company;

public class WarmBlooded extends Animal {
    private boolean canFly;

    public WarmBlooded(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public String print() {
        return getClass().getSimpleName() + " they can fly?\n It's - " + canFly;
    }

    public boolean getCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
