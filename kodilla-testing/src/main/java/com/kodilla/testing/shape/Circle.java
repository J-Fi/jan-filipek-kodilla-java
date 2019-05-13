package com.kodilla.testing.shape;

public class Circle implements Shape {
    int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;

        Circle circle = (Circle) o;

        return r == circle.r;

    }

    @Override
    public int hashCode() {
        return r;
    }
}
