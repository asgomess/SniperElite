package io.codeforall.bootcamp.sniper;


public enum BarrelType {
    PLASTIC,
    WOOD,
    METAL;

    private int health;
    public int getHealth(){
        return health;
    }
    public BarrelType getBarrelType(){
        return BarrelType.values()[this.ordinal()];
    }
}

