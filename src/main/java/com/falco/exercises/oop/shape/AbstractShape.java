package com.falco.exercises.oop.shape;

import java.awt.*;

public abstract class AbstractShape implements Computable, Movable, Resizable {
    String color;
    String id;

    public AbstractShape(String color, String id) {
        this.color = color;
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public String getId() {
        return id;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract void move(Point point);

    public abstract void resize(double form);

    public abstract double getArea();

    public abstract double getPerimeter();
}
