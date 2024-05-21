package com.codebind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Combat extends JFrame {
    Player player;
    Enemy enemy;

    public Combat(Enemy enemy) {
        this.enemy = enemy;
        while (player.getHealth() > 0 && enemy.getHealth() > 0) {
            int enemyDamage = enemy.attack();
            int playerDamage = player.attack();
            if(player.getSpeed() > enemy.getSpeed()) {
                player.takeDamage(enemyDamage);
                enemy.takeDamage(playerDamage);
            } 
            else {
                enemy.takeDamage(playerDamage);
                player.takeDamage(enemyDamage);
            }
        }
    }

}
