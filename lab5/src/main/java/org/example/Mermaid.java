package org.example;

import org.springframework.stereotype.Component;

@Component
public class Mermaid implements Monster {
    @Override
    public String getName() {
        return "Русалка";
    }

    @Override
    public String getAttack() {
        return "Затягивает в воду";
    }
}
