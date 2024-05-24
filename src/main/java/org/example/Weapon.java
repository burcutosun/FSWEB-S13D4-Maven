package org.example;

public enum Weapon {
    SWORD(50, 1.5),
    AXE(60, 1.2),
    BOW(40, 1.8),
    DAGGER(30, 2.0);

    private int damage;
    private double attackSpeed;

    Weapon(int damage,double attackSpeed){
        this.damage=damage;
        this.attackSpeed=attackSpeed;
    }

    public int getDamage(){
        return this.damage;
    }

    public double getAttackSpeed(){
        return this.attackSpeed;
    }
}
