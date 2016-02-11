package seaFight;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by witerius on 04.02.2016.
 */
public class HelperGames1 extends SozdanieNachalnihUsloviy {


    public class StartListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {


            HelperGames1 n = new HelperGames1(1,1);


        }
    }

    public class RenewListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            System.out.println("RenewtListener");

            MainSeaFight q = new MainSeaFight();

            GenKorableProtivnik bPP = new GenKorableProtivnik();
            GenKorablePlayer aPP = new GenKorablePlayer();
            HelperGames1 hg = new HelperGames1();
        }
    }

    public HelperGames1() {
        MainSeaFight.butStart.addActionListener(new StartListener());
        MainSeaFight.butRenew.addActionListener(new RenewListener());
    }

    public HelperGames1(int a, int b) {

        hodGameProtivnik();

        int ghp = getProtivnikHodI();
        int ghp1 = getProtivnikHodJ();


    }


}


