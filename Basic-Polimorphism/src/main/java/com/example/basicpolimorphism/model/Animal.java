package com.example.basicpolimorphism.model;

public abstract class Animal {
    //attributes
    protected float weight;
    protected int age;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLimb() {
        return limb;
    }

    public void setLimb(int limb) {
        this.limb = limb;
    }

    protected int limb;
    // animals methods
    public abstract void move();
    public abstract void eat();
    public abstract void sound();
}
