package com.falco.exercises.oop.basic;

public class Letter {

    String from;
    String to;
    StringBuilder body;

    public Letter(String from, String to, StringBuilder body) {
        this.from = from;
        this.to = to;
        this.body = body;
    }

    public void addLine(String line){
        body.append(" " + line);
    }

    public String getText(){
        return this.body.toString();
    }
}
