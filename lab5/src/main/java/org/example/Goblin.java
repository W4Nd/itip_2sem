package org.example;

import org.springframework.stereotype.Component;

@Component
public class Goblin implements Monster {
    @Override
    public String getName() {
        return "Гоблин";
    }

    @Override
    public String getAttack() {
        return "Бросает камни";
    }
}
