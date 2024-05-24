package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name,int healthPercentage,Weapon weapon){
        this.name=name;
        this.healthPercentage=Math.min(100,Math.max(healthPercentage,0));
        this.weapon=weapon;
    }

    public int healthRemaining(){
        return this.healthPercentage;
    }

    public void loseHealth(int damage){
        this.healthPercentage-=damage;
        if(this.healthPercentage<=0){
            this.healthPercentage=0;
            System.out.println(this.name+" player has been knocked out of game");
        }
    }

    public void restoreHealth(int healthPotion){
        this.healthPercentage=Math.min(100,this.healthPercentage+healthPotion);
    }

}
