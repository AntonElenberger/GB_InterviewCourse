package com.geekbrains.dz1.polimorfizm;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GeometryFigure geometryFigure = new GeometryFigure(12, "Unknown");
        GeometryFigure circle = new Circle(15, "Circle");
        GeometryFigure triangle = new Triangle(4, "Triangle");
        GeometryFigure square = new Square(20, "Square");

        List<GeometryFigure> figures = Arrays.asList(geometryFigure, circle, triangle, square);

        for(GeometryFigure g : figures) {
            g.areaCalculation();
        }
    }
}
