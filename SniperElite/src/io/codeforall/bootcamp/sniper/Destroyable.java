package io.codeforall.bootcamp.sniper;

public interface Destroyable {

    public abstract void hit(int points);

    public abstract boolean isDestroyed();

    public abstract int getHealth();


}
