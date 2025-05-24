package org.example;

import org.springframework.stereotype.Component;

@Component
public class Dragon implements Monster {
    @Override
    public String getName() {
        return "Дракон";
    }

    @Override
    public String getAttack() {
        return "Извергает пламя";
    }
}
