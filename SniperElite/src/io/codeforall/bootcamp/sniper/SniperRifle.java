package io.codeforall.bootcamp.sniper;

import java.sql.SQLOutput;

public class SniperRifle {
    private int bulletDamage;
    private int HIT_PROB ;
    private Destroyable target;


    public SniperRifle(){
        bulletDamage=1;
    }

    public void shoot(Destroyable target){
       HIT_PROB=(int)(Math.random()*100);
        if( HIT_PROB > 60) {
            System.out.println("Shot with power of "+HIT_PROB+" points.");
            target.hit(bulletDamage * HIT_PROB);

        } else{
            System.out.println("You missed the shot by lack of power!");
        }
    }
}
