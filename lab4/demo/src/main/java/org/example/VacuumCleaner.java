package org.example;

import org.springframework.stereotype.Component;

@Component("vacuumCleanerBean")
public class VacuumCleaner implements Appliance {
    @Override
    public String getDescription() {
        return "Пылесос: очищает полы от пыли.";
    }
}
