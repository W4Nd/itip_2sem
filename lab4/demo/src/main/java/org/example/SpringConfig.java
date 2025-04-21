// src/main/java/org/example/SpringConfig.java
package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class SpringConfig {

    @Bean(name = "homeBean")
    public Home getHomeBean(Refrigerator refrigerator) {
        return new Home(refrigerator);
    }
}
