package com.example.basicpolimorphism.model;

public class Fish extends Animal {
    private String scaleColor;

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    @Override
    public void move() {
        System.out.println("Swimming");
    }

    @Override
    public void eat() {
        System.out.println("Eating anything");
    }

    @Override
    public void sound() {
        System.out.println("fish doesn't make sound");
    }

    public void bubbles() {
        System.out.println("Releasing bubbles");
    }
}
