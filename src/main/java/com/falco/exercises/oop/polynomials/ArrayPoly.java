package com.falco.exercises.oop.polynomials;

import java.util.Arrays;

public class ArrayPoly extends AbstractPoly {

    double[] coefficients;
    int size;

    public ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients;
        size = coefficients.length;
    }

    @Override
    public double coefficient(int degree) {
        return coefficients[degree];
    }

    @Override
    public double[] coefficients() {
        return coefficients;
    }

    @Override
    public int degree() {
        return coefficients.length - 1;
    }

    @Override
    public Poly derivative() {
        double [] newCoefficients = new double[coefficients.length-1];
        System.arraycopy(coefficients, 1, newCoefficients, 0, coefficients.length);
        for (int i = 0; i < size; i++) {
            newCoefficients[i] += (i + 1);
        }
        ArrayPoly poly = new ArrayPoly(newCoefficients);
        return poly;
    }
}
