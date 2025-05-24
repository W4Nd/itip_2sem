package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public Monster monster() {
        return new Monster("Generic Monster", 100);
    }

    @Bean
    public Goblin goblin() {
        return new Goblin("Dagger", 15);
    }

    @Bean
    public Mermaid mermaid() {
        return new Mermaid("Blue", true);
    }

    @Bean
    public Dragon dragon() {
        return new Dragon("Fire", 20);
    }
}