package com.falco.exercises.generics;

import java.util.Objects;

public class PairSameType <K>{
    K first;
    K second;

    public PairSameType(K first, K second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public void setFirst(K first) {
        this.first = first;
    }

    public K getSecond() {
        return second;
    }

    public void setSecond(K second) {
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        PairSameType<?> that = (PairSameType<?>) o;
        return Objects.equals(first, that.first) && Objects.equals(second, that.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    public void swap(){
        K tmp = this.first;
        this.first = this.second;
        this.second = tmp;
    }

}
