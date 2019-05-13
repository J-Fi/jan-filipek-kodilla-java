package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> allShapes = new ArrayList<>();

    public List<Shape> getAllShapes() {
        return allShapes;
    }

    public void addFigure(Shape shape) {
        allShapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if(allShapes.contains(shape)) {
            allShapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        Shape shape = null;
        if(n >= 0 && n < allShapes.size()) {
            shape = allShapes.get(n);
        }
        return shape;
    }
}
