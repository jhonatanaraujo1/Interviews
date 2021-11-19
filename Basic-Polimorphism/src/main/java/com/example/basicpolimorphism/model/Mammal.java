package com.example.basicpolimorphism.model;

public class Mammal extends Animal {
    private String colorFur;

    public String getColorFur() {
        return colorFur;
    }

    public void setColorFur(String colorFur) {
        this.colorFur = colorFur;
    }

    @Override
    public void move() {
        System.out.println("Running");
    }

    @Override
    public void eat() {
        System.out.println("Feeding");
    }

    @Override
    public void sound() {
        System.out.println("Mammal sound");
    }
}
