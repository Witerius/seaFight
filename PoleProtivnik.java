package seaFight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by witerius on 03.02.2016.
 */
public class PoleProtivnik extends SozdanieNachalnihUsloviy
{
    private final int ROWS = 14;
    private final int COLUMNS = 14;
    private int n;

    public static int itx2S;
    public static int itx2SII;
    public static int itx2SJJ;
    public JPanel panelPP;
    public static JButton [] buttonsPlayer;



    public static JPanel panelPIP;
    public PoleProtivnik()
    {

        System.out.println("PoleProtivnik");

    }
    public PoleProtivnik(int gp)
    {
        System.out.println("PoleProtivnik(dfg)");
        generPan();
    }

    public static int getAdressKnokiProtivnika()
    {

        return itx2S;
    }
     public String addName()
     {
         String name = "" + n;
         return name;
     }

    public static int returnSII()
    {
        return itx2SII;
    }
    public static int returnSJJ()
    {
        return itx2SJJ;
    }
    public JPanel generPan(){


        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JButton button = (JButton)(ae.getSource());

                String tx1 = button.getName();
                int itx1 = Integer.parseInt(tx1);
                itx2S = itx1;

                setIiJj(itx1);
                itx2SII = II1;
                itx2SJJ = JJ1;

                gameProcess(II1,JJ1,3,4);

            }
        };
        buttonsPlayer = new JButton [ ROWS * COLUMNS ];

        for ( int i = 0; i < buttonsPlayer.length;  ++i ) {

            buttonsPlayer[i] = new JButton();
            buttonsPlayer[i].setPreferredSize(new Dimension(25,25));
            buttonsPlayer[i].addActionListener(listener);
              n = i;
              buttonsPlayer[i].setName(addName());


        }

        panelPP = new JPanel();
        panelPP.setLayout(new GridLayout(ROWS, COLUMNS));

        for ( JButton b  : buttonsPlayer )

            panelPP.add(b);

        panelPIP = panelPP;
        return panelPP;
    }
}
