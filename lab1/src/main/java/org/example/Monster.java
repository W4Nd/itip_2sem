package org.example;

public abstract class Monster {
    private String name;

    public Monster (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void specialAbility();
}
