package com.codebind;

import javax.swing.*;

public class Class extends Player{
    private  String className;
    private JPanel CombatWindow;
    public Class(String name, int health, int damage, int speed) {
        super(health, damage, speed, null);
        className = name;
    }
}
