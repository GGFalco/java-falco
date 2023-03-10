package com.falco.exercises.oop.basic;

import java.util.Objects;

public class RationalNumber {
    int numerator;
    int denominator;

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    private static int mcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public RationalNumber add(RationalNumber o) {
        int numeratorNew;
        int denominatorNew = mcd(this.denominator, o.denominator);
        denominatorNew = this.denominator * o.denominator / denominatorNew;
        numeratorNew = (this.numerator * denominatorNew / this.denominator) + (o.numerator * denominatorNew / o.denominator);
        RationalNumber newObj = new RationalNumber(numeratorNew, denominatorNew);
        return newObj;
    }

    public RationalNumber multiply(RationalNumber o) {
        int numeratorNew = this.numerator * o.numerator;
        int denominatorNew = this.denominator * o.denominator;
        RationalNumber newO = new RationalNumber(numeratorNew, denominatorNew);
        return newO;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        RationalNumber that = (RationalNumber) o;

        return this.numerator/this.denominator == that.numerator/ that.denominator;
        //return numerator == that.numerator && denominator == that.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        return "RationalNumber{" + "numerator=" + numerator + ", denominator=" + denominator + '}';
    }

    public static void main(String[] args) {
        RationalNumber myNum = new RationalNumber(1, 2);
        RationalNumber myNum2 = new RationalNumber(2, 4);
        System.out.println(myNum2.equals(myNum));
    }
}
