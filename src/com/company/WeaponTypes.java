package com.company;

public class WeaponTypes extends Weapon {
    private String name;
    private String type;
    private int damage;
    private int distance;

    public WeaponTypes() {
    }

    public WeaponTypes(String name, String type, int damage, int distance) {
        this.name = name;
        this.type = type;
        this.damage = damage;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    String getData() {
        return name + " " + type + " " + damage + " " + distance;
    }

    @Override
    int getTotalStrength() {
        if(type.equalsIgnoreCase("magical")){
            return damage * distance * 2;
        }
        else{
            return damage * distance;
        }
    }

    @Override
    public String toString() {
        return name + " " + type + " " + damage + " " + distance;
    }
}

