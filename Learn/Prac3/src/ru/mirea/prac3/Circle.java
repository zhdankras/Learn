package ru.mirea.prac3;

public class Circle extends Shape {

    protected double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
        this.filled = false;
        this.color = "blue";
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
