package com.kodilla.testing.shape;

public class Square implements Shape {
    int s;

    public Square(int s) {
        this.s = s;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getField() {
        return Math.pow(s,2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;

        Square square = (Square) o;

        return s == square.s;

    }

    @Override
    public int hashCode() {
        return s;
    }
}
