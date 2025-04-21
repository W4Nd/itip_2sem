package org.example;

public class Dragon {
    private String breathType;
    private int wingspan;

    public Dragon() {}

    public Dragon(String breathType, int wingspan) {
        this.breathType = breathType;
        this.wingspan = wingspan;
    }

    public String getBreathType() {
        return breathType;
    }

    public void setBreathType(String breathType) {
        this.breathType = breathType;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    @Override
    public String toString() {
        return "Dragon{breathType='" + breathType + "', wingspan=" + wingspan + "}";
    }
}