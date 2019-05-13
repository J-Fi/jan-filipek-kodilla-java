package com.kodilla.testing.shape;

public class Triangle implements Shape {
    double h;
    double p;

    public Triangle(double h, double p) {
        this.h = h;
        this.p = p;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return 0.5 * h * p;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.h, h) != 0) return false;
        return Double.compare(triangle.p, p) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(h);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(p);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
