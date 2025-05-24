package org.example;

public class Mermald extends  Monster {

    public Mermald() { super("Русалка"); }

    @Override
    public void specialAbility() {System.out.println(getName() + " может петь и приманивать моряков");}

}
