package org.example;

public class Main {
    public static void main(String[] args) {
        Monster goblin = new Goblin();
        Monster mermald = new Mermald();
        Monster dragon = new Dragon();

        goblin.specialAbility();
        mermald.specialAbility();
        dragon.specialAbility();
    }
}