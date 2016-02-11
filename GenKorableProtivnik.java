package seaFight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by witerius on 03.02.2016.
 */
public class GenKorableProtivnik extends PoleProtivnik
{  GenKorableProtivnik(){ System.out.println("PoleProtivnik(dfg)");
    GeneratorPoleBoya qq = new GeneratorPoleBoya();

    Kater ka1 = new Kater();
    Kater ka2 = new Kater();
    Kater ka3 = new Kater();
    Kater ka4 = new Kater();
    Fregat fr1 = new Fregat();
    Fregat fr2 = new Fregat();
    Fregat fr3 = new Fregat();
    KreyserA kr = new KreyserA();
    KreyserA kr1 = new KreyserA();
    Esminec es1 = new Esminec();
    new GeneratorPoleBoya("g");
}



}


