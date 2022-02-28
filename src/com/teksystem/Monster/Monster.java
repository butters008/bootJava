package com.teksystem.Monster;

public class Monster {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Monster(String name) {
        this.name = name;
    }

    public String attack(){
        return "I don't know how to attack!";
    }
}
