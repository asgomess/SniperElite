package io.codeforall.bootcamp.sniper;

public class Enemy extends GameObject implements Destroyable{

    private int health;
    private boolean destroyed=false;

    public Enemy(int health){
        this.health=health;

    }


    public int getHealth(){
        return health;
    }

    public void setHealth(int health){
        this.health=health;
    }


    @Override
    public void hit(int points){
        health=health-points;
        if (health <= 0){
           // isDestroyed();
            setHealth(0);
            System.out.println("The SoldierEnemy have been destroyed!");
        }else {
            System.out.println("Soldier hitted! Remains " + health + "% of health.");
        }
    }

    @Override
    public String getMessage(){
        String string=" - It's an enemy.";
        return string;
    }

    @Override
    public boolean isDestroyed(){
        destroyed=!destroyed;
        return destroyed;
    }

}