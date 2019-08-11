package com.geekbrains.dz1.polimorfizm;

public class Square extends GeometryFigure {
    public Square(int area, String name) {
        super(area, name);
    }

    @Override
    public void areaCalculation() {
        System.out.println("I am called " + getName() + " and my area is " + getArea());
        System.out.println("Method to calculate area is: side multiplied by side");
    }
}
