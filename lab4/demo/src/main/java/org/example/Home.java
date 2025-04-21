package org.example;

public class Home {
    private Appliance appliance;

    
    public Home(Appliance appliance) {
        this.appliance = appliance;
    }

    public void showApplianceInfo() {
        System.out.println(appliance.getDescription());
    }
}