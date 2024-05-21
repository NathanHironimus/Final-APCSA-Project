package com.codebind;

public class Player {
    private int health;
    private String name;
    private int damage;
    private int speed;
    private String className;

    private Class heroClass;

    public Player(int health, int damage, int speed, Class heroClass) {
        this.health = health;
        this.damage = damage;
        this.speed = speed;
        this.heroClass = heroClass;
    }

    public Class getHeroClass() {
        return heroClass;
    }

    public void setHeroClass(Class heroClass) {
        this.heroClass = heroClass;
    }

    public int attack() {
        Die attackDie = new Die(damage);
        return attackDie.roll();
    }

    public void takeDamage(int hit) {
        health -= hit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

}
