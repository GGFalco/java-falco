package com.falco.exercises.oop.basic;

import java.awt.*;
import java.util.Arrays;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Polygon {

    Point [] vertices;

    public Polygon(Point[] vertices) {
        this.vertices = vertices;
    }

    public int getVerticesCount(){
        return vertices.length/2;
    }

    public Point[] getVertices() {
        return vertices;
    }

    public void setVertices(Point[] vertices) {
        this.vertices = vertices;
    }

    @Override
    public String toString() {
        return "Polygon{" + "vertices=" + Arrays.toString(vertices) + '}';
    }

    public static void main(String[] args) {
        RandomGenerator rnd = new RandomGenerator();
    }
}
