package com.falco.exercises.oop.polynomials;

public interface Poly {

    public double coefficient(int degree);
    public double[] coefficients();
    public int degree();
    public Poly derivate();
}
