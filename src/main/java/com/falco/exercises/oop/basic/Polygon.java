package com.falco.exercises.oop.basic;

import java.awt.*;
import java.util.Arrays;

public class Polygon {

    Point[] vertices;

    public Polygon(Point[] vertices) {
        this.vertices = vertices;
    }

    /**
     * Distance beetween A(xA,yA) and B(xB,yB) is [ sqrt( (xA - xB)^2 + (yA - yB)^2 ) ]
     *
     * @return perimeter of a Polygon
     */
    public double getPerimeter() {
        double perimeter = 0.0;

        for (int i = 0; i < this.vertices.length; i++) {
            // % vertices.length perchè cosi quando arrivo a i = 3 non accedo alla posizione 4 che non c'è nei vertici
            // ma accedo alla (3+1)%4 = 0 ==> cioè torno al vertice iniziale
            int next = (i + 1) % this.vertices.length;
            perimeter += Math.hypot(vertices[i].x - vertices[next].x, vertices[i].y - vertices[next].y);
        }

        return perimeter;
    }

    public double getArea() {
        double area = 0.0;
        for (int i = 0; i < vertices.length; i++) {
            int next = (i + 1) % this.vertices.length;
            area += (vertices[i].x * vertices[next].y) - (vertices[next].x * vertices[i].y);
        }
        return Math.abs(area / 2.0);
    }

    public int getVerticesCount() {
        return vertices.length;
    }

    @Override
    public String toString() {

        return "Polygon{" + "vertices=" + Arrays.toString(vertices) + '}';
    }
}
