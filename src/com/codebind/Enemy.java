package com.codebind;

public class Enemy {
    private int health;
    private int damage;
    private int speed;
    private String name;

    public Enemy(String name, int health, int damage, int speed) {
        this.health = health;
        this.damage = damage;
        this.speed = speed;
        this.name = name;
    }

    public int attack() {
        Die attackDie = new Die(damage);
        return attackDie.roll();
    }

    public void takeDamage(int hit) {
        health -= hit;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
