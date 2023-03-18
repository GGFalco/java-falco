package com.falco.exercises.oop.shape;

import java.awt.*;

public class Circle extends AbstractShape {

    Point center;
    double radius;

    public Circle(String color, String id, Point center, double radius) {
        super(color, id);
        this.center = center;
        this.radius = radius;
    }

    @Override
    public void move(Point point) {
        center.translate(point.x, point.y);
    }

    @Override
    public void resize(double form) {
        radius *= form;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, radius);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "center=" + center + ", radius=" + radius + ", color='" + color + '\'' + ", id='" + id + '\'' + '}';
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }
}
