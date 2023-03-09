package com.falco.exercises.oop.basic;

import java.util.Objects;

public class ClickCounter {
    int clicks;

    public ClickCounter(){
        clicks = 0;
    }

    public int getClicks() {
        return clicks;
    }

    public void click(){
        clicks += 1;
    }
    public void undo(){
        clicks = Math.max(0, clicks-1);
    }

    public void reset(){
        clicks = 0;
    }

    @Override
    public String toString() {
        return "ClickCounter{" + "clicks=" + clicks + '}';
    }

    /* La funzione statica è riferita solo alla classe e non alle istanze*/
    public static void hello(){
        System.out.println("Hello");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ClickCounter that = (ClickCounter) o;
        return clicks == that.clicks;
    }

    @Override
    public int hashCode() {
        return Objects.hash(clicks);
    }

    public static void main(String[] args) {
        ClickCounter cc1 = new ClickCounter();
        ClickCounter cc2 = new ClickCounter();
        System.out.println(cc1.equals(cc2)); // darebbe falso senza quell'Override di equals
        cc1.click();
        cc1.click();
        ClickCounter.hello();
        System.out.println(cc1);
    }

}
