package com.company;

public abstract class Weapon {
    abstract String getData();
    abstract int getTotalStrength();

    String printWeapon(){
        return getData() + " " + getTotalStrength();
    }
}
