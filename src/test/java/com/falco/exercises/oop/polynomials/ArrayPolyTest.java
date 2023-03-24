package com.falco.exercises.oop.polynomials;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ArrayPolyTest {

    Poly [] polies = new Poly[2];

    @BeforeEach
    void setUp(){
        polies[0] = new ArrayPoly(new double[]{1.0,2.0,3.0});
        ArrayList<Double> coefficients = new ArrayList<Double>();
        coefficients.add(1.0);
        coefficients.add(2.0);
        coefficients.add(3.0);
        polies[1] = new ListPoly(coefficients);
    }

    @Test
    void coefficient() {
        assertEquals(1.0, polies[0].coefficient(0));
    }

    @Test
    void coefficients() {
    }

    @Test
    void degree() {
    }

    @Test
    void derivative() {
    }
}