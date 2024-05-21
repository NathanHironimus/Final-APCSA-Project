package com.codebind;


import javax.swing.*;
import java.awt.*;


public class Game extends JFrame{
   private JPanel MainPanel;
   private JLabel Background;
   private JLabel Orc;
   private JLabel Goblin;
   private JLabel Dragon;
   private JFormattedTextField Text;
   private JPanel BackGroundLayer;
   private JPanel OrcLayer;
   private JPanel GoblinLayer;
   private JPanel DragonLayer;
   private JPanel TextBar;


   public Game() {
       setContentPane(MainPanel);
       Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
       setExtendedState(JFrame.MAXIMIZED_BOTH);
       setUndecorated(true);
       setTitle("HeartSword");
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setSize(screenSize);
       setLocationRelativeTo(null);
       setVisible(true);


       ImageIcon Background = new ImageIcon("lib\\StartScreen.jpg");
       Image scaledImage = Background.getImage().getScaledInstance(screenSize.width, screenSize.height, java.awt.Image.SCALE_SMOOTH);
       ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
       this.Background.setIcon(scaledImageIcon);


       ImageIcon goblin = new ImageIcon("lib\\goblin.jpg");
       Goblin.setIcon(goblin);


       ImageIcon orc = new ImageIcon("lib\\orc.jpg");
       Orc.setIcon(orc);


       ImageIcon dragon = new ImageIcon("lib\\dragon.jpg");
       Dragon.setIcon(dragon);


       Text.setText("Welcome to HeartSword");


       JLayeredPane layeredPane = new JLayeredPane();
       layeredPane.add(BackGroundLayer, JLayeredPane.DEFAULT_LAYER);
       layeredPane.add(GoblinLayer, JLayeredPane.PALETTE_LAYER);
       layeredPane.add(OrcLayer, JLayeredPane.PALETTE_LAYER);
       layeredPane.add(DragonLayer, JLayeredPane.PALETTE_LAYER);
       layeredPane.add(TextBar, JLayeredPane.PALETTE_LAYER);


                           


   }


   public static void main(String[] args) {
       new Game();
   }



}



