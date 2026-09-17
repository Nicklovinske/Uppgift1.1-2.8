package org.Uppgift1P3;

public class Character {
    private int health;
    private int maxHealth;

    public Character(int health, int maxHealth){
        this.health = health;
        this.maxHealth = maxHealth;
        if (health < 0){
            this.health = 0;
        }
        if (maxHealth < health){
            this.health = maxHealth;
        }

        public void takeDamage(int amount){
            this.health = this.health - amount;
            if (amount > this.health){
                this.health = 0;
            }
        }
    }
}
