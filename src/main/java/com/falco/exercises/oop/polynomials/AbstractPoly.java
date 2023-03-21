package com.falco.exercises.oop.polynomials;

import java.util.Arrays;
import java.util.Objects;

public abstract class AbstractPoly implements Poly {

    public AbstractPoly() {

    }

    @Override
    public String toString() {
        return "AbstractPoly{coefficients: " + Arrays.toString(coefficients()) + ", degree: " + degree();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        AbstractPoly that = (AbstractPoly) o;

        if (this.degree() != ((AbstractPoly) o).degree()) {
            return false;
        }

        for (int i = 0; i < ((AbstractPoly) o).coefficients().length; i++) {
            if (this.coefficient(i) != ((AbstractPoly) o).coefficient(i)) {
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
