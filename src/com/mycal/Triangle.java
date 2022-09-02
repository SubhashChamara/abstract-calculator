package com.mycal;

public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return this.base * this.height;

    }
}
