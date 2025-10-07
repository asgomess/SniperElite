package io.codeforall.bootcamp.sniper;

public class ArmouredEnemy extends Enemy implements Destroyable{
    private int armourLimit;
    private int armour;
    private int health;

    public ArmouredEnemy(int health, int armour){
        super(health);
        this.armour=armour;

    }
    public void setArmour(int armour){
        this.armour=armour;
    }

    @Override
    public void hit(int points){
        if(points >= armour) {
            armourLimit = points - armour;
            health = getHealth() - armourLimit;


            if (health<=0) {
                setHealth(0);
                armour=0;
                //isDestroyed();
                System.out.println("Enemy's have been destroyed");
            }else if (health>0){
                setHealth(health);
                armour=0;
                System.out.println("Hitted! Armour destroyed and health reduced to " + health + "%.");
            }

        } else if(points < armour) {
                setArmour(armour-points);
                System.out.println("Only armour hitted! Remains " + armour+ "% of armour.");

        }else if (health >= 0){
                System.out.println("The armour was destroyed. Remains "+health+"% of health!");
        }



    }
}
