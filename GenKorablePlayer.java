package seaFight;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by witerius on 03.02.2016.
 */
public class GenKorablePlayer extends PolePlayer
{

    public GenKorablePlayer()
    {
        System.out.println("GenKorablePlayer");

        MainSeaFight.butGorizont.addActionListener(new GorListener());
        MainSeaFight.butVertical.addActionListener(new VertListener());

    }

    public class GorListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            System.out.println("GorListener");


            MainSeaFight.labelTB = new JLabel("Установите корабль");
            napravlenieKor=1;


        }
    }
    public class VertListener implements  ActionListener {
        public void actionPerformed(ActionEvent a) {
            System.out.println("VertListener");
            MainSeaFight.labelTB = new JLabel("Установите корабль");
            napravlenieKor = 0;



        }
    }
}
