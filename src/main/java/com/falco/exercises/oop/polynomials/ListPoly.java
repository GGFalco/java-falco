package com.falco.exercises.oop.polynomials;

import java.util.ArrayList;
import java.util.List;

public class ListPoly extends AbstractPoly {

    ArrayList<Double> coefficients;

    public ListPoly(ArrayList<Double> coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public double coefficient(int degree) {
        return coefficients.get(degree);
    }

    @Override
    public double[] coefficients() {
        double[] newCoefficients = new double[coefficients.size()];
        int i = 0;
        for (double coefficient : coefficients) {
            newCoefficients[i++] = coefficient;
        }
        return newCoefficients;
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        ArrayList<Double> newCoefficients = new ArrayList<Double>();
        for (int i = 1; i < coefficients.size(); i++) {
            newCoefficients.add(coefficients.get(i) * i);
        }
        ListPoly newPoly = new ListPoly(newCoefficients);
        return newPoly;
    }



}
