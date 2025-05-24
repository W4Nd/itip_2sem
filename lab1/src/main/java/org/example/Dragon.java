package org.example;

public class Dragon extends  Monster {

    public Dragon() { super("Дракон"); }

    @Override
    public void specialAbility() {System.out.println(getName() + " может дышать огнем");}

}
