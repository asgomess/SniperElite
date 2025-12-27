package io.codeforall.bootcamp.sniper;

public class Game {

    private GameObject[] gameObjects;
    private int numObjects = 10;
    private SniperRifle sniperRifle;
    private int shotsFired;
    private int armourScore = 80;


    public Game() {
        gameObjects = new GameObject[numObjects];
        sniperRifle = new SniperRifle();
    }

    public void start() {
        createObject(numObjects);

        for (int i = 0; i < numObjects; i++) {

            if (gameObjects[i] instanceof Tree) {
                System.out.println(gameObjects[i].getMessage()+"Pos. "+i);
                i++;

            } else if (gameObjects[i] instanceof Destroyable target) {
                System.out.println(gameObjects[i].getMessage()+"at position "+i);

                do{
                   // System.out.println("entrei nessa merda");
                    sniperRifle.shoot(target);
                    shotsFired++;

                }while(target.getHealth()>0);

            }
            System.out.println("Number of shots fired: "+shotsFired +"\n");
        }
    }


    //Create objects based on 1/3rd of probability for trees and barrel
    public GameObject[] createObject(int numObjects) {

        int countTree = (int) (Math.ceil(numObjects / 4));
        int countBarrel = (int) (Math.ceil(numObjects / 4));
        int chooseBarrel;

        //System.out.println("valor inicial trees "+countTree);


        for (int i = 0; i < numObjects; i++) {

            int shootOrNotShoot = (int) (Math.random() * 4);
            //     System.out.println("escolheu shoot or not option: "+shootOrNotShoot);

            if (shootOrNotShoot == 0 && countTree > 0) {
                gameObjects[i] = new Tree();
                // System.out.println("entrou tree "+gameObjects[i]);
                countTree--;


            } else if (shootOrNotShoot == 1) {
                gameObjects[i] = new ArmouredEnemy(100, armourScore);
                //System.out.println("entrou enemy armoured "+gameObjects[i]);

            } else if (shootOrNotShoot == 2) {
                gameObjects[i] = new SoldierEnemy(100);
                //     System.out.println("entrou soldier enemy " +gameObjects[i]);

            } else if (shootOrNotShoot == 3 && countBarrel > 0) {

                // System.out.println("entrou no barrel");
                chooseBarrel = (int) (Math.random() * 3);

                if (chooseBarrel == 0) {
                    gameObjects[i] = new Barrel(BarrelType.METAL);
                    // System.out.println("escolheu metal "+gameObjects[i]);
                } else if (chooseBarrel == 1) {
                    gameObjects[i] = new Barrel(BarrelType.PLASTIC);
                    //    System.out.println("escolheu plastico "+gameObjects[i]);
                } else if (chooseBarrel == 2) {
                    gameObjects[i] = new Barrel(BarrelType.WOOD);
                    // System.out.println("escolheu madeira "+gameObjects[i]);
                }
                countBarrel--;
            } else {
                i--;
                // System.out.println("\nThe maximum value of trees or barrel have beenb reached!\n");
            }
        }
        return gameObjects;

    }

}
