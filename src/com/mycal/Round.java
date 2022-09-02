package com.mycal;

public class Round extends Shape{

    private int radius;

    public Round(int radius) {
        this.radius = radius;
    }

    public double area () {
        return Math.PI*Math.pow(radius,2);
    }
}
