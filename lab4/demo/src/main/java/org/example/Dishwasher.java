package org.example;

import org.springframework.stereotype.Component;

@Component("dishwasherBean")
public class Dishwasher implements Appliance {
    @Override
    public String getDescription() {
        return "Посудомоечная машина: моет посуду автоматически.";
    }
}
