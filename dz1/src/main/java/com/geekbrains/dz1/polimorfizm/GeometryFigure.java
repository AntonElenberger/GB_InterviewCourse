package com.geekbrains.dz1.polimorfizm;

public class GeometryFigure {
    private int area;
    private String name;

    public GeometryFigure(int area, String name) {
        this.area = area;
        this.name = name;
    }

    public void areaCalculation() {
        System.out.println("I am called " + name + " and my area is " + area);
        System.out.println("Method to calculate area is: ?");
    }

    public int getArea() {
        return area;
    }

    public String getName() {
        return name;
    }

}
