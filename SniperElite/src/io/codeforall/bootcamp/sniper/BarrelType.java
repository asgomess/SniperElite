package io.codeforall.bootcamp.sniper;


public enum BarrelType {
    PLASTIC,
    WOOD,
    METAL;

    private int maxDamage;
    public int getMaxDamage(){
        return maxDamage;
    }
    public BarrelType getBarrelType(){
        return BarrelType.values()[this.ordinal()];
    }
}

