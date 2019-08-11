package com.geekbrains.dz1.polimorfizm;

public class Triangle extends GeometryFigure {
    public Triangle(int area, String name) {
        super(area, name);
    }

    @Override
    public void areaCalculation() {
        System.out.println("I am called " + getName() + " and my area is " + getArea());
        System.out.println("Method to calculate area is: base multiplied by height divided by 2");
    }
}
