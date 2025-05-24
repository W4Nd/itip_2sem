package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.management.monitor.MonitorSettingException;

@Configuration
@ComponentScan("org.example")
public class SpringConfig {
    @Bean
    public MonsterParty monsterParty() {
        return new MonsterParty(new Goblin());
    }
}
