import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
//Wrote by Wilson.
//The goal is to create a brick breaking game.
//In this Main class, l created the Jframe, outer window, created as an object.
//Set properties of the Jframe and import the jframe package.
//pro-obj.setBounds - to create a 10,10,700,600
//pro-obj.setTitle - Name game
//pro-obj.setRes - etc.
public class Main {
    public static void main(String[] args) {

        JFrame obj = new JFrame();
        Gameplay gamePlay = new Gameplay();
        obj.setBounds(10, 10, 600, 700);
        obj.setTitle("Breakout ball");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);

//Class gameplay is added as an object in the jframe object class
        }


}

