package com.falco.exercises.oop.shape;

import java.awt.*;

public class Rectangle extends AbstractShape {

    Point bottomRight;
    Point upperLeft;

    public Rectangle(String color, String id, Point bottomRight, Point upperLeft) {
        super(color, id);
        this.bottomRight = bottomRight;
        this.upperLeft = upperLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public void setUpperLeft(Point upperLeft) {
        this.upperLeft = upperLeft;
    }

    @Override
    public double getArea() {
        return (bottomRight.x - upperLeft.x) * (upperLeft.y - bottomRight.y) / 2.0;
    }

    @Override
    public double getPerimeter() {
        return ((bottomRight.x - upperLeft.x) + (upperLeft.y - bottomRight.y)) * 2;
    }

    @Override
    public void move(Point point) {
        bottomRight.translate(point.x, point.y);
        upperLeft.translate(point.x, point.y);
    }

    /**
     * We fix the upperLeft then we move the bottomRight x to the right and the bottomRight y below
     * @param form is the scale factor
     */
    @Override
    public void resize(double form) {
        bottomRight.x = (int) (upperLeft.x + (bottomRight.x - upperLeft.x) * form);
        bottomRight.y = (int) (upperLeft.y - (upperLeft.y - bottomRight.y) * form);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "bottomRight=" + bottomRight + ", upperLeft=" + upperLeft + ", color='" + color + '\'' + ", id='" + id + '\'' + '}';
    }
}
