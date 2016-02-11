package seaFight;

import javax.swing.*;
import java.awt.*;


/**
 * Created by witerius on 03.02.2016.
 */
public class MainSeaFight
{
    public static JFrame frame;
    JLabel labelA;
    JLabel labelB;
    JLabel labelC;
    JLabel labelD;
    public static JLabel labelTB;
    JLabel labelAB;
    public static JButton butStart;
    public static JButton butRenew;
    public static JButton butGorizont;
    public static JButton butVertical;
    public static JPanel panelD5B;

    public MainSeaFight() {
                     int appa = 0;


        JPanel panelA = new JPanel();
        JPanel panelB = new JPanel();
        JPanel panelC = new JPanel();
        JPanel panelD = new JPanel();


        JPanel panelD1 = new JPanel();
        JPanel panelD2 = new JPanel();
        JPanel panelD3 = new JPanel();
        JPanel panelD4 = new JPanel();
        JPanel panelD5 = new JPanel();
        JPanel panelD5A = new JPanel();

        panelD5B = new JPanel();
        panelD.setLayout(new GridLayout(5, 2));

                                                   PolePlayer aPPa = new PolePlayer(appa);
                                                   PoleProtivnik bPPb = new PoleProtivnik(appa);


        labelA = new JLabel("Поле игрока");
        labelAB = new JLabel("                                                         ");
        labelB = new JLabel("Поле противника");
        labelC = new JLabel("" ); //Начать/ Остановить игру");
        labelD = new JLabel("Установить направление кораблей");
        //  labelTB = new JLabel("Список кораблей игрока и противника");
        labelTB = new JLabel(" ");
      //butStart = new JButton("Старт");

       // butRenew = new JButton("Занова ");

        butGorizont = new JButton("По горизонтали");

        butVertical = new JButton(" По вертикали ");

        frame = new JFrame("Simplified SeaFight");

        frame.setSize( 1400, 700);

                                panelA.add(aPPa.panelPIP1);
                                panelB.add(bPPb.panelPIP);

        panelC.add(labelA);
        panelC.add(labelAB);
        panelC.add(labelB);
        panelD.add(panelD1);
        panelD.add(panelD2);
        panelD.add(panelD3);
        panelD.add(panelD4);
        panelD.add(panelD5);

        panelD5.add(panelD5A);
        panelD5.add(panelD5B);
        panelD5A.add(labelTB);

        // JTable tb = makeTable();


        //  panelD5B.add(HelperGames.makeTable());

        panelD1.add(panelD2);
        panelD1.add(panelD3);

        panelD2.add(labelD);
        panelD3.add(butGorizont);
        panelD3.add(butVertical);

        panelD4.add(labelC);

//        panelD4.add(butStart);
  //      panelD4.add(butRenew);










        frame.getContentPane().add(BorderLayout.WEST, panelA);
        frame.getContentPane().add(BorderLayout.CENTER, panelD);
        frame.getContentPane().add(BorderLayout.EAST, panelB);
        frame.getContentPane().add(BorderLayout.NORTH, panelC);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);


    }

    public static void main(String[] args)
    {

        MainSeaFight q = new MainSeaFight();

        GenKorableProtivnik bPP = new GenKorableProtivnik();
        GenKorablePlayer aPP = new GenKorablePlayer();
        HelperGames1 hg = new HelperGames1();

    }
}

