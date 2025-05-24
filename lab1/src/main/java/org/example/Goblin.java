package org.example;

public class Goblin extends  Monster {
    public Goblin() { super("Гоблин"); }

    @Override
    public void specialAbility() { System.out.println(getName() + " может украсть предметы");}
}
