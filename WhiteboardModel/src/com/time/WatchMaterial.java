package com.time;

public enum WatchMaterial {
    PLASTIC("Plastic"),
    STEEL("Steel"),
    SILVER("Silver"),
    GOLD("Gold"),
    ALUMINUM("Aluminum"),
    TITANIUM("Titanium");
    private String material;
    WatchMaterial(String material){
        this.material = material;


    }

    public String getMaterial() {
        return material;
    }

    public String toString(){
        return getMaterial();
    }
}