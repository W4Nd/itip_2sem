package org.example;

import org.springframework.stereotype.Component;

@Component("refrigeratorBean")
public class Refrigerator implements Appliance {
    @Override
    public String getDescription() {
        return "Холодильник: сохраняет продукты свежими.";
    }
}