package seaFight;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by witerius on 03.02.2016.
 */
public class AbstrSeaFight //extends SozdanieNachalnihUsloviy
{

 }
 interface MinMax
 {
     int MIN1 = 0;
     int MIN2 = 1;

     int MIN4 = 12;
     int MIN5 = 10;
     int MIN6 = 11;
     int MIN7 = 9;

     int FR1 = 3;
     int FR2 = 4;
     int FR3 = 5;
     int FR4 = 6;
     int FR5 = 2;
 }
 abstract class SozdanieNachalnihUsloviy
 {String playerResult;
     String protivnikResult;
     int playerKorab = 20;
     int protivnikKorab = 20;
     int protivnikHodI;
     int protivnikHodJ;

     public static SozdanieNachalnihUsloviy [][] korables = new SozdanieNachalnihUsloviy[14][14];
     public static SozdanieNachalnihUsloviy [][] korablesA = new SozdanieNachalnihUsloviy[14][14];
     public static ArrayList<String> temp = new ArrayList<>();
     public static ArrayList<Integer> temp1 = new ArrayList<>();
     public static ArrayList<Integer> temp2 = new ArrayList<>();
     public static ArrayList<Integer> temp3 = new ArrayList<>();
     public static ArrayList<Integer> temp4 = new ArrayList<>();

     public static ArrayList<String> tempA = new ArrayList<>();
     public static ArrayList<Integer> temp1A = new ArrayList<>();
     public static ArrayList<Integer> temp2A = new ArrayList<>();
     public static ArrayList<Integer> temp3A = new ArrayList<>();
     public static ArrayList<Integer> temp4A = new ArrayList<>();
     public static int tempPxP = 0;


     public static Map<String, Integer> mapKorable = new HashMap<>();
     public static Map<String, Integer> mapKorableA = new HashMap<>();

     public static int gTypeCorabl;
     String nameYacheyka;
     String sostoyanieYacheyka;
     String nameKorablya;
     public  int typeKorablya;


     int tempIntX;
     int tempIntY;

     int tempIntZ;



     String tempStringSostoyanieObiekta;
     String tempStringBukvCifr;

     String tempStringY;

     String nameKorab;

     int II1;
     int JJ1;
     public int getProtivnikHodI()
     {
         return protivnikHodI;
     }
     public int getProtivnikHodJ()
     {
         return protivnikHodJ;
     }
     public String getPlayerResult()
     {
         return playerResult;
     }
     public String getProtivnikResult()
     {
         return protivnikResult;
     }
     public int getPlayerKorab()
     {
         return playerKorab;
     }
     public int getProtivnikKorab()
     {
         return protivnikKorab;
     }
public int getIiJjII()
{
    return II1;
}
     public int getIiJjJJ()
     {
         return JJ1;
     }
     public void setIiJj(int IiJj)
     {
         int ii=0;
         int jj=0;

         int itx1 = IiJj;

         if (itx1 <= 13) {
             ii = 0;
             jj = itx1;
         }
         else if (itx1 <= 27 && itx1 > 13) {
             ii = 1;
             jj = itx1 - 14;
         }
         else if (itx1 <= 41 && itx1 > 27) {
             ii = 2;
             jj = itx1 - 28;
         }
         else if (itx1 <= 55 && itx1 > 41) {
             ii = 3;
             jj = itx1 - 42;
         }
         else if (itx1 <= 69 && itx1 > 55) {
             ii = 4;
             jj = itx1 - 56;
         }
         else if (itx1 <= 83 && itx1 > 69) {
             ii = 5;
             jj = itx1 - 70;
         }
         else if (itx1 <= 97 && itx1 > 83) {
             ii = 6;
             jj = itx1 - 84;
         }
         else if (itx1 <= 111 && itx1 > 97) {
             ii = 7;
             jj = itx1 - 98;
         }
         else if (itx1 <= 125 && itx1 > 111) {
             ii = 8;
             jj = itx1 - 112;
         }
         else if (itx1 <= 139 && itx1 > 125) {
             ii = 9;
             jj = itx1 - 126;
         }
         else if (itx1 <= 153 && itx1 > 139) {
             ii = 10;
             jj = itx1 - 140;
         }
         else if (itx1 <= 167 && itx1 > 153) {
             ii = 11;
             jj = itx1 - 154;
         }
         else  if (itx1 <= 181 && itx1 > 167) {
             ii = 12;
             jj = itx1 - 168;
         }
         else  if (itx1 <= 195 && itx1 > 181) {
             ii = 13;
             jj = itx1 - 182;
         }
         II1 = ii;
         JJ1 = jj;
     }
public int setIJ(int Ii, int Jj)
{
    int ii=Ii;


    int itx1;

    if(ii ==0)
    {
        itx1 = Jj;
    }
    else  {
        itx1 =14*ii+Jj;
    }

   return itx1;

}

     //8 метод для работы с ячейками
     public String getNameYacheyka()
     {
         return nameYacheyka;
     }
     String getSostoyanieYacheyka()
     {
         return sostoyanieYacheyka;
     }
     String getNameKorablya()
     {
         return nameKorablya;
     }
     int getTypeKorablya()
     {
         return typeKorablya;
     }
     void setNameYacheyka(String sn)
     {
         nameYacheyka = sn;

     }
     void setSostoyanieYacheyka(String sy)
     {
         sostoyanieYacheyka = sy;

     }
     void setNameKorablya(String snk)
     {
         nameKorablya = snk;

     }
     void setTypeKorablya(int tk)
     {
         typeKorablya = tk;
     }
     //генератор случайных чисел для generPoziciiYacheekSaytaI(int a, int b)
     public int randomChisl(int min, int max) {
         max -= min;
         return (int) (Math.random() * ++max) + min;
     }

public void hodProtivnika()
{
    int z=0;
    int ghp=0;
    int ghp1 =0;
   while(z == 0)
    {
        ghp = randomChisl(1, 12);
        ghp1 = randomChisl(1, 12);
        String sost = korablesA[ghp][ghp1].getSostoyanieYacheyka();
        if ((sost.equals("ПЛ") || sost.equals("ММ")))
        {
            z=0;
        }
        else
        {
            z=1;
            protivnikHodI= ghp;
            protivnikHodJ= ghp1;
            proverkaVvodaA("",ghp, ghp1);
        }
    }


}
     public void hodProtivnika(int a, int b)
     {

         String sost = null;
         int ghp=0;
         int ghp1=0;

             ghp = randomChisl(a - 1, b + 1);
             ghp1 = randomChisl(a - 1, b + 1);
             sost = korablesA[ghp][ghp1].getSostoyanieYacheyka();


         protivnikHodI= ghp;
         protivnikHodJ= ghp1;

     }


     public int generPoziciiYacheekKorablyaI(int a, int b)  //метод используется несколько раз. для генерации направления кораблей,
     // для генерации расположения кораблей.
     {
         int mi = a;
         int ma = b;
         int rndPoziciiYacheekKorabl = randomChisl(mi, ma);
         return rndPoziciiYacheekKorabl;
     }

     public void gameProcess(int a1, int a2, int b1, int b2)
     {
         proverkaVvoda("", a1, a2);

     }



     void hodGameProtivnik() { /////////////////////////////////
         while (tempPxP == 1) {
             int gpk1;
             String gpr1;
             hodProtivnika();
             int nomersI = getProtivnikHodI();
             int nomersJ = getProtivnikHodJ();

             proverkaVvodaA("", nomersI, nomersJ);

             gpr1 = getPlayerResult();
             gpk1 = getPlayerKorab();
             if (!(gpr1.equals("ПЛ"))) {
                 tempPxP = 0;

                 break;
             }
         }
     }


public String proverkaVvoda(String pv, int nomersI, int nomersJ)
{String gny;
    String gsy;
    String gnk;
    int gtt;
    int val;
    int gakp =  PoleProtivnik.getAdressKnokiProtivnika();
    for(int i1 = 0; i1 <14; i1++)
    {

        for(int j1 = 0; j1 <14; j1++)
        {


            gny = korables[i1][j1].getNameYacheyka();

            if(pv.equals(gny) || (nomersI == i1 && nomersJ == j1))
            {
                gsy = korables[i1][j1].getSostoyanieYacheyka();

                protivnikResult = gsy;
                if(gsy.equals("Це"))
                {
                    korables[i1][j1].setSostoyanieYacheyka("ПЛ");

                    protivnikKorab-=1;
                    PoleProtivnik.buttonsPlayer[gakp].setBackground(Color.red);
                    System.out.println("Попал");
                    gnk = korables[i1][j1].getNameKorablya();

                    Iterator<Map.Entry<String, Integer>> iterator  = mapKorable.entrySet().iterator();
                    while(iterator.hasNext())
                    {
                        Map.Entry<String, Integer> pair = iterator.next();
                        String key = pair.getKey();
                        if(key.equals(gnk)) {
                            Integer value = pair.getValue();
                            val = value-1;
                            mapKorable.put(gnk,val);
                            if(val==0)
                            {
                                gTypeCorabl = korables[i1][j1].getTypeKorablya();
                                System.out.println("Вы потопили " + gnk);
                            }
                        }
                    }

                }
                else
                {
                    korables[i1][j1].setSostoyanieYacheyka("ММ");
                    PoleProtivnik.buttonsPlayer[gakp].setBackground(Color.darkGray);
                    System.out.println("Мимо");
                    hodProtivnika();
                }
            }

        }
        System.out.println("");
    }
    for(int i1 = 0; i1 <14; i1++)
    {

        for(int j1 = 0; j1 <14; j1++)
        {



            System.out.print(korables[i1][j1].getSostoyanieYacheyka() + " ");

        }
        System.out.println("");
    }
    for(int i1 = 0; i1 <14; i1++)
    {

        for(int j1 = 0; j1 <14; j1++)
        {



            System.out.print(korables[i1][j1].getNameKorablya() + " ");

        }
        System.out.println("");
    }
    Iterator<Map.Entry<String, Integer>> iterator  = mapKorable.entrySet().iterator();
    while(iterator.hasNext())
    {
        Map.Entry<String, Integer> pair = iterator.next();
        String key = pair.getKey();
        Integer value = pair.getValue();
        System.out.println(key + " " + value);

    }
    return protivnikResult;
}
     public  String proverkaVvodaA(String pvv, int nomersIi, int nomersJj)
     {String gny;
         String gsy;
         String gnk;
         int gtt;
         int val;
         int gakp = setIJ(nomersIi, nomersJj);

         System.out.println(nomersIi + " "+ nomersJj + " " + nomersIi * nomersJj);
         for(int i1 = 0; i1 <14; i1++)
         {

             for(int j1 = 0; j1 <14; j1++)
             {


                 gny = korablesA[i1][j1].getNameYacheyka();

                 if(pvv.equals(gny) || (nomersIi == i1 && nomersJj == j1))
                 {
                     gsy = korablesA[i1][j1].getSostoyanieYacheyka();
                     playerResult = gsy;

                     if(gsy.equals("Це"))
                     {
                         korables[i1][j1].setSostoyanieYacheyka("ПЛ");
                         playerKorab-=1;
                         PolePlayer.buttonsPlayer1[gakp].setBackground(Color.red);
                         System.out.println("Попал");
                         gnk = korablesA[i1][j1].getNameKorablya();

                         Iterator<Map.Entry<String, Integer>> iterator  = mapKorableA.entrySet().iterator();
                         while(iterator.hasNext())
                         {
                             Map.Entry<String, Integer> pair = iterator.next();
                             String key = pair.getKey();
                             if(key.equals(gnk)) {
                                 Integer value = pair.getValue();
                                 val = value-1;
                                 mapKorableA.put(gnk,val);
                                 if(val==0)
                                 {
                                     gTypeCorabl = korablesA[i1][j1].getTypeKorablya();
                                     System.out.println("Вы потопили " + gnk);
                                 }
                             }
                         }

                         hodProtivnika();
                     }
                     else
                     {
                         korablesA[i1][j1].setSostoyanieYacheyka("ММ");
                         PolePlayer.buttonsPlayer1[gakp].setBackground(Color.darkGray);
                         System.out.println("Мимо");
                     }
                 }

             }
             System.out.println("");
         }
         for(int i1 = 0; i1 <14; i1++)
         {

             for(int j1 = 0; j1 <14; j1++)
             {



                 System.out.print(korablesA[i1][j1].getSostoyanieYacheyka() + " ");

             }
             System.out.println("");
         }
         for(int i1 = 0; i1 <14; i1++)
         {

             for(int j1 = 0; j1 <14; j1++)
             {



                 System.out.print(korablesA[i1][j1].getNameKorablya() + " ");

             }
             System.out.println("");
         }
         Iterator<Map.Entry<String, Integer>> iterator  = mapKorableA.entrySet().iterator();
         while(iterator.hasNext())
         {
             Map.Entry<String, Integer> pair = iterator.next();
             String key = pair.getKey();
             Integer value = pair.getValue();
             System.out.println(key + " " + value);

         }
         return playerResult;
     }


     public String generBukvi(int q) {
         // генерирует букву для названия ячейки исходя из номера
         String bukvaRndPoziciiYacheekKorablY;
         int rndPoziciiYacheekKorablY = q;
         if (rndPoziciiYacheekKorablY == 0) {
             bukvaRndPoziciiYacheekKorablY = "Z";
         } else if (rndPoziciiYacheekKorablY == 1) {
             bukvaRndPoziciiYacheekKorablY = "A";
         } else if (rndPoziciiYacheekKorablY == 2) {
             bukvaRndPoziciiYacheekKorablY = "B";
         } else if (rndPoziciiYacheekKorablY == 3) {
             bukvaRndPoziciiYacheekKorablY = "C";
         } else if (rndPoziciiYacheekKorablY == 4) {
             bukvaRndPoziciiYacheekKorablY = "D";
         } else if (rndPoziciiYacheekKorablY == 5) {
             bukvaRndPoziciiYacheekKorablY = "E";
         } else if (rndPoziciiYacheekKorablY==6)   {
             bukvaRndPoziciiYacheekKorablY = "F";
         } else if (rndPoziciiYacheekKorablY==7)   {
             bukvaRndPoziciiYacheekKorablY = "G";
         } else if (rndPoziciiYacheekKorablY==8)   {
             bukvaRndPoziciiYacheekKorablY = "H";
         } else if (rndPoziciiYacheekKorablY==9)   {
             bukvaRndPoziciiYacheekKorablY = "I";
         } else if (rndPoziciiYacheekKorablY==10)  {
             bukvaRndPoziciiYacheekKorablY = "J";
         } else if (rndPoziciiYacheekKorablY==11)  {
             bukvaRndPoziciiYacheekKorablY = "K";
         } else if (rndPoziciiYacheekKorablY==12)  {
             bukvaRndPoziciiYacheekKorablY = "L";
         }
         else
         {
             bukvaRndPoziciiYacheekKorablY = "M";
         }
         return bukvaRndPoziciiYacheekKorablY;

     }

     public void ustanovkaZnacheniyaCeliy(int x, int y, String snk1, int tk)
     {
         korables[x][y].setSostoyanieYacheyka("Це");
         korables[x][y].setNameKorablya(snk1);
         korables[x][y].setTypeKorablya(tk);
     }
     public void ustanovkaZnacheniyaCeliyA(int x, int y, String snk1, int tk)
     {
         korablesA[x][y].setSostoyanieYacheyka("Це");
         korablesA[x][y].setNameKorablya(snk1);
         korablesA[x][y].setTypeKorablya(tk);
     }


 }
 class GeneratorYacheyki extends SozdanieNachalnihUsloviy
 {
     public GeneratorYacheyki()
     {System.out.println("Konstruktor GeneratorYacheyki");
     }
     public GeneratorYacheyki(String snyp, String syyp, String snK)
     {
         String snYP=snyp;
         String syYP = syyp;
         setNameYacheyka(snYP);
         setSostoyanieYacheyka(syYP);
         setNameKorablya(snK);

     }

 }


 class GeneratorPoleBoya extends GeneratorYacheyki
 {

     public GeneratorPoleBoya()
     {
         System.out.println("GeneratorPoleBoya");
         sozdKorables();

         vivodDannixIsKorables();



     }

     public GeneratorPoleBoya(String x)
     {System.out.println("Konstruktor GeneratorPoleBoya sss");

         vivodDannixIsKorables();
         vivodDannixIsKorablesA();
     }
     public  void sozdKorables()
    {
        String st;
        String stn = "--";
        String snk = "more";
        int stk = 0;

        for(int i1 = 0; i1 <14; i1++)
        {
            st = generBukvi(i1);

            for(int j1 = 0; j1 <14; j1++)
            {String stTemp = st + j1;
                korables[i1][j1] = new GeneratorYacheyki(stTemp, stn, snk); //, stk);
                korablesA[i1][j1] = new GeneratorYacheyki(stTemp, stn, snk);
            }
        }

    }


    public void vivodDannixIsKorables()
    {

        for(int i1 = 0; i1 <14; i1++)
        {

            for(int j1 = 0; j1 <14; j1++)
            {


                System.out.print(korables[i1][j1].getNameYacheyka() + " ");


            }
            System.out.println("");
        }
        for(int i1 = 0; i1 <14; i1++)
        {

            for(int j1 = 0; j1 <14; j1++)
            {



                System.out.print(korables[i1][j1].getSostoyanieYacheyka() + " ");

            }
            System.out.println("");
        }
        for(int i1 = 0; i1 <14; i1++)
        {

            for(int j1 = 0; j1 <14; j1++)
            {



                System.out.print(korables[i1][j1].getNameKorablya() + " ");

            }
            System.out.println("");
        }

    }



    public void vivodDannixIsKorablesA()
    {

        for(int i1 = 0; i1 <14; i1++)
        {

            for(int j1 = 0; j1 <14; j1++)
            {


                System.out.print(korablesA[i1][j1].getNameYacheyka() + " ");


            }
            System.out.println("");
        }
        for(int i1 = 0; i1 <14; i1++)
        {

            for(int j1 = 0; j1 <14; j1++)
            {



                System.out.print(korablesA[i1][j1].getSostoyanieYacheyka() + " ");

            }
            System.out.println("");
        }
        for(int i1 = 0; i1 <14; i1++)
        {

            for(int j1 = 0; j1 <14; j1++)
            {



                System.out.print(korablesA[i1][j1].getNameKorablya() + " ");

            }
            System.out.println("");
        }

    }
}
class KorableA extends SozdanieNachalnihUsloviy implements MinMax {

    public KorableA(){}
    public void generKorable(int gk1, int gk2, int gk3, int fr1, int fr2) {
        int i;

        for (i = 0; i < fr1; i++) { // i<3
            temp.add(i, "NZ");
            temp1.add(i, i);
            temp2.add(i, i);
            temp3.add(i, i);

        }
        for (i = 0; i < fr2; i++) // i<5
        {
            temp4.add(i, i);
        }

        int ok = 0;
        while (ok < 1) {

            //генерация направления: по горизонтали или вертикали
            tempIntZ = generPoziciiYacheekKorablyaI(gk1, gk2);//MIN1, MIN2);

            //генерация координаты Х горизонталь
            tempIntX = generPoziciiYacheekKorablyaI(gk2, gk3);//MIN2, MIN5);
            //генерация координаты У вертикаль
            tempIntY = generPoziciiYacheekKorablyaI(gk2, gk3);//MIN2, MIN5);

            //перевод координаты Y в буквенное значение
            tempStringY = generBukvi(tempIntY);

            ok++;

            if (tempIntZ == 0) {

                for (int i1 = 0; i1 < fr1; i1++) {  //i1 < 3
                    tempStringSostoyanieObiekta = korables[tempIntX][tempIntY].getSostoyanieYacheyka();

                    //создание буквенно-цифрового значения
                    tempStringBukvCifr = tempStringY + tempIntX;

                    if (tempStringSostoyanieObiekta.equals("Це") || tempStringSostoyanieObiekta.equals("БЗ")) {
                        ok--;
                        break;
                    } else {

                        temp.set(i1, tempStringBukvCifr);
                        temp1.set(i1, tempIntX);
                        temp2.set(i1, tempIntY);
                        tempIntX += 1;
                    }

                }

            } else {
                for (int i1 = 0; i1 < fr1; i1++) {  //i1 < 3
                    tempStringSostoyanieObiekta = korables[tempIntX][tempIntY].getSostoyanieYacheyka();

                    //создание буквенно-цифрового значения
                    tempStringBukvCifr = tempStringY + tempIntX;

                    if (tempStringSostoyanieObiekta.equals("Це") || tempStringSostoyanieObiekta.equals("БЗ")) {
                        ok--;
                        break;
                    } else {
                        temp.set(i1, tempStringBukvCifr);
                        temp1.set(i1, tempIntX);
                        temp2.set(i1, tempIntY);
                        tempIntY += 1;
                        //перевод координаты Y в буквенное значение
                        tempStringY = generBukvi(tempIntY);
                    }

                }
            }
        }

    }

    public void generKorableA(int gk1, int gk2, int gk3, int fr1, int fr2) {
        int i;

        for (i = 0; i < fr1; i++) { // i<3
            tempA.add(i, "NZ");
            temp1A.add(i, i);
            temp2A.add(i, i);
            temp3A.add(i, i);

        }
        for (i = 0; i < fr2; i++) // i<5
        {
            temp4A.add(i, i);
        }

        int ok = 0;
        while (ok < 1) {

            //установка направления: по горизонтали или вертикали
            tempIntZ = gk1;//generPoziciiYacheekKorablyaI(gk1, gk2);//MIN1, MIN2);

            //генерация координаты Х горизонталь
            tempIntX = gk2;//generPoziciiYacheekKorablyaI(gk2, gk3);//MIN2, MIN5);
            //генерация координаты У вертикаль
            tempIntY = gk3; //generPoziciiYacheekKorablyaI(gk2, gk3);//MIN2, MIN5);

            //перевод координаты Y в буквенное значение
            tempStringY = generBukvi(tempIntY);

            ok++;

            if (tempIntZ == 0) {

                for (int i1 = 0; i1 < fr1; i1++) {
                    tempStringSostoyanieObiekta = korablesA[tempIntX][tempIntY].getSostoyanieYacheyka();

                    //создание буквенно-цифрового значения
                    tempStringBukvCifr = tempStringY + tempIntX;

                    if (tempStringSostoyanieObiekta.equals("Це") || tempStringSostoyanieObiekta.equals("БЗ")) {
                        ok--;


                        break;
                    } else {

                        tempA.set(i1, tempStringBukvCifr);
                        temp1A.set(i1, tempIntX);
                        temp2A.set(i1, tempIntY);
                        tempIntX += 1;
                    }

                }

            } else {
                for (int i1 = 0; i1 < fr1; i1++) {  //i1 < 3
                    tempStringSostoyanieObiekta = korablesA[tempIntX][tempIntY].getSostoyanieYacheyka();

                    //создание буквенно-цифрового значения
                    tempStringBukvCifr = tempStringY + tempIntX;

                    if (tempStringSostoyanieObiekta.equals("Це") || tempStringSostoyanieObiekta.equals("БЗ")) {

                        ok--;
                        break;
                    } else {
                        tempA.set(i1, tempStringBukvCifr);
                        temp1A.set(i1, tempIntX);
                        temp2A.set(i1, tempIntY);
                        tempIntY += 1;
                        //перевод координаты Y в буквенное значение
                        tempStringY = generBukvi(tempIntY);
                    }

                }
            }
        }

    }

    public void vvodKorable(int fr1, int fr2, String vksnk, int tk1) {
        int x1;
        int y1;
        int x2;
        int y2;
        int frr1 = fr1;
        int frr2 = fr2;
        for (int i = 0; i < frr1; i++) // i<3
        {
            x1 = temp1.get(i);
            y1 = temp2.get(i);

            ustanovkaZnacheniyaCeliy(x1, y1, vksnk, tk1);

        }
        x1 = temp1.get(0);
        y1 = temp2.get(0);

        int ix;
        int iy;

        if (tempIntZ == 0) {
            int yy1 = y1 - 1;
            for (iy = 0; iy < 3; iy++) // iy<frr1
            {
                int xx1 = x1 - 1;
                for (ix = 0; ix < frr2; ix++) //ix <5
                {
                    System.out.println(xx1 + " " + yy1 + " " + x1 + " " + y1);
                    tempStringSostoyanieObiekta = korables[xx1][yy1].getSostoyanieYacheyka();
                    if (!(tempStringSostoyanieObiekta.equals("Це"))) {
                        korables[xx1][yy1].setSostoyanieYacheyka("БЗ");
                    }
                    xx1++;
                }
                yy1++;

            }

        } else {
            int xx1 = x1 - 1;
            for (iy = 0; iy < 3; iy++) //iy <frr1
            {
                int yy1 = y1 - 1;
                for (ix = 0; ix < frr2; ix++) // ix <5
                {
                    System.out.println(xx1 + " " + yy1 + " " + x1 + " " + y1);
                    tempStringSostoyanieObiekta = korables[xx1][yy1].getSostoyanieYacheyka();
                    if (!(tempStringSostoyanieObiekta.equals("Це"))) {
                        korables[xx1][yy1].setSostoyanieYacheyka("БЗ");
                    }

                    yy1++;
                }
                xx1++;

            }

        }

    }

    public void vvodKorableA(int fr1, int fr2, String vksnk, int tk1) {
        int x1;
        int y1;
        int x2;
        int y2;
        int frr1 = fr1;
        int frr2 = fr2;
        for (int i = 0; i < frr1; i++) // i<3
        {
            x1 = temp1A.get(i);
            y1 = temp2A.get(i);

            ustanovkaZnacheniyaCeliyA(x1, y1, vksnk, tk1);

        }
        x1 = temp1A.get(0);
        y1 = temp2A.get(0);

        int ix;
        int iy;

        if (tempIntZ == 0) {
            int yy1 = y1 - 1;
            for (iy = 0; iy < 3; iy++)
            {
                int xx1 = x1 - 1;
                for (ix = 0; ix < frr2; ix++) //ix <5
                {
                    System.out.println(xx1 + " " + yy1 + " " + x1 + " " + y1);
                    tempStringSostoyanieObiekta = korablesA[xx1][yy1].getSostoyanieYacheyka();
                    if (!(tempStringSostoyanieObiekta.equals("Це"))) {
                        korablesA[xx1][yy1].setSostoyanieYacheyka("БЗ");
                    }
                    xx1++;
                }
                yy1++;

            }

        } else {
            int xx1 = x1 - 1;
            for (iy = 0; iy < 3; iy++)
            {
                int yy1 = y1 - 1;
                for (ix = 0; ix < frr2; ix++) // ix <5
                {
                    System.out.println(xx1 + " " + yy1 + " " + x1 + " " + y1);
                    tempStringSostoyanieObiekta = korablesA[xx1][yy1].getSostoyanieYacheyka();
                    if (!(tempStringSostoyanieObiekta.equals("Це"))) {
                        korablesA[xx1][yy1].setSostoyanieYacheyka("БЗ");
                    }

                    yy1++;
                }
                xx1++;

            }

        }

    }
}
class KreyserA extends KorableA
{
    public KreyserA() {
        System.out.println("KreyserA");
        int typeK = 3;
        setTypeKorablya(3);
        nameKorab = "Kreyser" + randomChisl(1, 1000);
        mapKorable.put(nameKorab, typeK);
        try {
            generKorable(MIN1, MIN2, MIN5, FR1, FR3);
            vvodKorable(FR1, FR3, nameKorab, 3);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of BOUNDS");

        }
    }
    public KreyserA(int a, int b, int c) {
        System.out.println("KreyserA (fg)");
        int typeK = 3;
        setTypeKorablya(3);
        nameKorab = "Kreyser" + randomChisl(1, 1000);
        mapKorableA.put(nameKorab, typeK);
        try {
            generKorableA( a, b, c, FR1, FR3);
            vvodKorableA(FR1, FR3, nameKorab, 3);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of BOUNDS");

        }
    }
}

class Fregat extends KorableA
{

    public  Fregat ()
    {
        System.out.println("fregat");
        int typeK = 2;
        setTypeKorablya(2);
        nameKorab = "Fregat" + randomChisl(1, 1000);
        mapKorable.put(nameKorab, typeK);
        try {
            generKorable(MIN1, MIN2, MIN6, FR5, FR2);
            vvodKorable(FR5, FR2, nameKorab, 2);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of BOUNDS");
        }
    }
    public  Fregat (int a, int b, int c)
    {
        System.out.println("fregat(hfgf)");
        int typeK = 2;
        setTypeKorablya(2);
        nameKorab = "Fregat" + randomChisl(1, 1000);
        mapKorableA.put(nameKorab, typeK);
        try {
            generKorableA(a, b, c, FR5, FR2);
            vvodKorableA(FR5, FR2, nameKorab, 2);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of BOUNDS");

        }
    }
}
class Kater extends KorableA
{
    public Kater()
    {
        System.out.println("kater");
        int typeK = 1;
        setTypeKorablya(1);
        nameKorab = "Kater" + randomChisl(1, 1000);
        mapKorable.put(nameKorab, typeK);
        try {
            generKorable(MIN1, MIN2, MIN4, MIN2, FR1);
            vvodKorable(MIN2, FR1, nameKorab, 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of BOUNDS");
        }
    }
    public Kater(int a, int b, int c)
    {
        System.out.println("kater(gh)");
        int typeK = 1;
        setTypeKorablya(1);
        nameKorab = "Kater" + randomChisl(1, 1000);
        mapKorableA.put(nameKorab, typeK);
        try {
            generKorableA(a, b, c,   MIN2, FR1);
            vvodKorableA(MIN2, FR1, nameKorab, 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of BOUNDS");
              }
    }
}
class Esminec extends KorableA
{
    public Esminec()
    {
        System.out.println("esminec");
        int typeK = 4;
        setTypeKorablya(4);
        nameKorab = "Esminec" + randomChisl(1, 1000);
        mapKorable.put(nameKorab, typeK);
        try {
            generKorable(MIN1, MIN2, MIN7, FR2, FR4);
            vvodKorable(FR2, FR4, nameKorab, 4);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of BOUNDS");
        }
    }
    public Esminec(int a, int b, int c)
    {
        System.out.println("esminec(gfh)");
        int typeK = 4;
        setTypeKorablya(4);
        nameKorab = "Esminec" + randomChisl(1, 1000);
        mapKorableA.put(nameKorab, typeK);
        try {
            generKorableA( a, b,c,  FR2, FR4);
            vvodKorableA(FR2, FR4, nameKorab, 4);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of BOUNDS");
            }
    }
}