package com.teksystem.Monster;

import com.teksystem.Monster.Monster;

public class StoneMonster extends Monster {

    public StoneMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with stone!";
    }
}
