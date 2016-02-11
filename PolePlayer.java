package seaFight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by witerius on 03.02.2016.
 */
public class PolePlayer extends SozdanieNachalnihUsloviy
{
    private int ii;
    private int jj;
    public static int itx1SII;
    public static int itx1SJJ;
    public static int napravlenieKor;

    public static int gorVert;
public static int getTypeKorab;

    public static int iNa=0;

    private final int ROWS1 = 14;
    private final int COLUMNS1 = 14;
    private int n;


    public static int itx1S;
    public JPanel panelPP1;
    public static JButton [] buttonsPlayer1;


    public static JPanel panelPIP1;
    public PolePlayer()
    {System.out.println("PolePLayer");

    }
    public PolePlayer(int gp)
    {

        System.out.println("PolePlayer(dfgqqq)");
        generPan();
    }

   public String addName()
    {
        String name = "" + n;
        return name;
    }
    public void ustanCvet(int itx1i, int gtk1)
    {
        System.out.println("ustanCvet");
        if(napravlenieKor == 1)
        {
            int  pp= itx1i+gtk1;
            for(int i = itx1i; i<pp; i++) {
                buttonsPlayer1[i].setBackground(Color.green);
            }
        }
        else if (napravlenieKor == 0)
        {
            int vert = itx1i;
            for(int i = 0; i<gtk1; i++) {

                buttonsPlayer1[vert].setBackground(Color.green);
                vert +=14;
            }
        }

    }

   public void najatieKnopki()
   {   iNa++;
       gorVert++;
       int iiJjI;
       int jjIiJ;
       MainSeaFight.labelTB = new JLabel(" ");

       int itx1 = itx1S;
       setIiJj(itx1);
       iiJjI = getIiJjII();
       jjIiJ = getIiJjJJ();


       itx1SII = iiJjI;
       itx1SJJ =  jjIiJ;

       String gsy1 = korablesA[iiJjI][jjIiJ].getSostoyanieYacheyka();

       if (gsy1.equals("Це") || gsy1.equals("БЗ")) {

           iNa--;
           gorVert--;

       }
       else
       {


           if(gorVert == 1)
           {
               System.out.println(napravlenieKor);
               Kater ka1 = new Kater(napravlenieKor, iiJjI, jjIiJ);
               System.out.println("111");

           }
           else if(gorVert == 2)
           {System.out.println(napravlenieKor);
               Kater ka2 = new Kater(napravlenieKor,iiJjI, jjIiJ);

           }
           else if(gorVert == 3)
           {System.out.println(napravlenieKor);
               Kater ka3 = new Kater(napravlenieKor,iiJjI, jjIiJ);

           }
           else if(gorVert == 4)
           {System.out.println(napravlenieKor);
               Kater ka4 = new Kater(napravlenieKor,iiJjI, jjIiJ);

           }

           else if(gorVert == 5)
           {System.out.println(napravlenieKor);
               Fregat fr1 = new Fregat(napravlenieKor,iiJjI, jjIiJ);

           }

           else if(gorVert == 6)
           {System.out.println(napravlenieKor);
               Fregat fr2 = new Fregat(napravlenieKor,iiJjI, jjIiJ);

           }
           else if(gorVert == 7)
           {System.out.println(napravlenieKor);
               Fregat fr3 = new Fregat(napravlenieKor,iiJjI, jjIiJ);

           }
           else if(gorVert == 8)
           {System.out.println(napravlenieKor);
               KreyserA kr = new KreyserA(napravlenieKor,iiJjI, jjIiJ);

           }
           else if(gorVert == 9)
           {System.out.println(napravlenieKor);
               KreyserA kr1 = new KreyserA(napravlenieKor,iiJjI, jjIiJ);

           }
          else  if(gorVert == 10)
           {System.out.println(napravlenieKor);
               Esminec es1 = new Esminec(napravlenieKor,iiJjI, jjIiJ);


           }
           int gtk =  korablesA[iiJjI][jjIiJ].getTypeKorablya();
           ustanCvet(itx1, gtk);
           new GeneratorPoleBoya("g");

       }


   }


    public JPanel generPan(){
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JButton button = (JButton)(ae.getSource());

                String tx1 = button.getName();
                int itx1 = Integer.parseInt(tx1);
                itx1S = itx1;
                System.out.println("ActionListener generPan");
                najatieKnopki();

            }
        };
        buttonsPlayer1 = new JButton [ ROWS1 * COLUMNS1 ];
        for ( int i = 0; i < buttonsPlayer1.length;  ++i ) {

            buttonsPlayer1[i] = new JButton();
            buttonsPlayer1[i].setPreferredSize(new Dimension(25, 25));

            buttonsPlayer1[i].addActionListener(listener);


            n = i;
            buttonsPlayer1[i].setName(addName());

        }
        panelPP1 = new JPanel();
        panelPP1.setLayout(new GridLayout(ROWS1, COLUMNS1));
        for ( JButton b  : buttonsPlayer1 )

            panelPP1.add(b);
       panelPIP1 = panelPP1;
        return panelPP1;
    }

}
