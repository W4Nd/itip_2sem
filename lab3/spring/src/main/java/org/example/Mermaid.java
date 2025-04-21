package org.example;

public class Mermaid {
    private String hairColor;
    private boolean isFriendly;

    public Mermaid() {}

    public Mermaid(String hairColor, boolean isFriendly) {
        this.hairColor = hairColor;
        this.isFriendly = isFriendly;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    @Override
    public String toString() {
        return "Mermaid{hairColor='" + hairColor + "', isFriendly=" + isFriendly + "}";
    }
}