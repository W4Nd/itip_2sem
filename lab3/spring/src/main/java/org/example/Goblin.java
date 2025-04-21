package org.example;

public class Goblin {
    private String weapon;
    private int strength;

    public Goblin() {}

    public Goblin(String weapon, int strength) {
        this.weapon = weapon;
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Goblin{weapon='" + weapon + "', strength=" + strength + "}";
    }
}