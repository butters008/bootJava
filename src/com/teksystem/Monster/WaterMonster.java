package com.teksystem.Monster;

import com.teksystem.Monster.Monster;

public class WaterMonster extends Monster {
    public WaterMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with Water";
    }
}
