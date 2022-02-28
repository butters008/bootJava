package com.teksystem.Monster;

import com.teksystem.Monster.Monster;

public class FireMonster extends Monster {

    public FireMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with Fire!";
    }
}
