package com.falco.exercises.oop.basic;

import java.awt.*;

public class Circle {
    int radius;
    Point center = new Point();

    public Circle(int radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public double getArea() {
        return Math.pow(Math.PI, Math.PI) * this.radius;
    }

    // distanza dal punto e minore dalla distanza dal raggio
    public boolean contains(Point point) {
        return point.distance(center) < this.radius;
    }

    public void translate(int dx, int dy) {
        this.center.x += dx;
        this.center.y += dy;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", Center={x= " + center.x + ", y= " + center.y + '}';
    }

    public static void main(String[] args) {
        Circle cc = new Circle(5, new Point(0, 0));
        System.out.println(cc);
    }
}
