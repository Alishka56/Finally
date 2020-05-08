package com.company;

import java.util.ArrayList;

public class Weapons implements WeaponsInterface {
    ArrayList<Weapon> weapons = new ArrayList<>();

    public Weapons() {
    }

    public Weapons(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }

    @Override
    public void addWeapon(Weapon weapon) {
        weapons.add(weapon);
    }

    @Override
    public String printWeaponss() {
        String s="";
        for (int i=0;i<weapons.size();i++){
            s+=weapons.get(i).printWeapon() + "\n";
        }
        return s;
    }
}
