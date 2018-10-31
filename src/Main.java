import javax.swing.JFrame ;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
//Wrote by Wilson.

//In this Main class, l created the Jframe
public class Main {
    public static void main(String[] args) {

        JFrame obj = new JFrame();
        Gameplay gamePlay = new Gameplay();
        obj.setBounds(10,10,600,700);
        obj.setTitle("Breakout ball");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        obj.add(gamePlay);

        }

    }

