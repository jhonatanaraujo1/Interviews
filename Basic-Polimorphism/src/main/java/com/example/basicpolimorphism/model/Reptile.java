package com.example.basicpolimorphism.model;

public class Reptile extends Animal{
    private String scaleColor;

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    @Override
    public void move() {
        System.out.println("Crawling");
    }

    @Override
    public void eat() {
        System.out.println("eating vegetables");
    }

    @Override
    public void sound() {
        System.out.println("Reptile sound");
    }
}
