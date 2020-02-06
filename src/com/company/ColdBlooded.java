package com.company;

public class ColdBlooded extends Animal {
    private boolean canClimbe;

    public ColdBlooded(boolean canClimbe) {
        this.canClimbe = canClimbe;
    }

    @Override
    public String print() {
        return getClass().getSimpleName() + " they can climbe?\n it's - " + canClimbe;
    }

    public boolean isCanClimbe() {
        return canClimbe;
    }

    public void setCanClimbe(boolean canClimbe) {
        this.canClimbe = canClimbe;
    }
}
