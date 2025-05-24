package org.example;


public class MonsterParty {
    private Monster monster;

    public MonsterParty(Monster monster) {
        this.monster = monster;
    }


    public void showMonster() {
        System.out.println("Монстр: " + monster.getName());
        System.out.println("Атака: " + monster.getAttack());
    }
}