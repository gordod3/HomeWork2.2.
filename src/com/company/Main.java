package com.company;

public class Main {
    private static Animal createObject(String className){
        switch(className){
            case "Mammals":
                Mammals d1 = new Mammals("Banana");
                return d1;
            case "ColdBlooded":
                ColdBlooded d2 = new ColdBlooded(true);
                return d2;
            case "WarmBlooded":
                WarmBlooded d3 = new WarmBlooded(false);
                return d3;
            case "Amphibian":
                Amphibian d4 = new Amphibian("Mister Jabkin");
                return d4;
            default:
                System.out.println("ERROR");
                return null;
        }
    }

    public static void main(String[] args) {
        createObject("Mammals").print();
        createObject("ColdBlooded").print();
        createObject("WarmBlooded").print();
        createObject("Amphibian").print();

    }
}
