package io.codeforall.bootcamp.sniper;

public class Barrel extends GameObject implements Destroyable{
    private BarrelType barrelType;
    private int health;
    private boolean destroyed=false;

    public Barrel (BarrelType barrelType){
       this.barrelType=barrelType;
        if(barrelType.getBarrelType()==BarrelType.METAL) {
            health = 500;
        }else if(barrelType.getBarrelType()==BarrelType.WOOD){
            health = 200;
        }else if(barrelType.getBarrelType()==BarrelType.PLASTIC){
            health = 100;
        }
    }

    public int getHealth(){
        return health;
    }
    @Override
    public void hit(int points){
        health=health-points;
        if (health <= 0){
            health=0;
            isDestroyed();
            System.out.println("The barrel have been destroyed!");
        }else{
            System.out.println("Barrel was hitted! Remains " + health + "% of health.");
        }
    }

    @Override
    public boolean isDestroyed(){
        destroyed=!destroyed;
        return destroyed;
    }

    @Override
    public String getMessage(){
        String string=" - It's a barrel!";
        return string;
    }


}
