package com.falco.exercises.oop.basic;

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

    public static void main(String[] args) {
        ClickCounter cc1 = new ClickCounter();
        cc1.click();
        cc1.click();
        System.out.println(cc1);
    }
}
