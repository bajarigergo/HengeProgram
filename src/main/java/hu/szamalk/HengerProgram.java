package hu.szamalk;

import hu.szamalk.MertaniHenger;
import java.util.ArrayList;
import java.util.List;

public class HengerProgram {
    private List<MertaniHenger> hengerek;

    public HengerProgram() {
        TomorHenger t = new TomorHenger(2,1,1);
        LyukasHenger ly = new LyukasHenger(2,1,1,2);
        hengerek = new ArrayList<>();
        hengerek.add(t);
        hengerek.add(ly);
        /*hengerek.add(new MertaniHenger(1,1));
        hengerek.add(new TomorHenger(1,1,2));
        hengerek.add(new LyukasHenger(1,1,1,1));
        hengerek.add(new LyukasHenger(1,1,1,.5));*/
        //hengerek.add(new LyukasHenger(4,1,1,2));

        //for (MertaniHenger henger : hengerek){
        //    System.out.println(henger);
        //}
        for (MertaniHenger henger : this.lista()) {
            System.out.println(henger);
        }
        System.out.println("Hengerek átlagtérfogata: "+ this.atlagTerfogat());

        System.out.println("súly: " + t.suly());

        System.out.println("Csövek súlya: "+ ly.suly());

    }

    public double atlagTerfogat() {
    double terfogatOsszes = 0;
    for (MertaniHenger henger : this.lista()) {
            terfogatOsszes += henger.terfogat();
        }
    return terfogatOsszes / (double) MertaniHenger.getHengerDarab();
    }
    public double csovekSulya() {
        double osszTomeg = 0;
        for (MertaniHenger henger : this.lista()) {
            if (henger instanceof LyukasHenger){
                osszTomeg += ((LyukasHenger) henger).suly();
            }
        }
        return osszTomeg;
    }
    private List<MertaniHenger> lista(){
        return hengerek;
    }

    public void run(){
        int db = MertaniHenger.getHengerDarab();
        System.out.printf("hengerek (%d db): \n",db);

    }

    public static void main(String[] args) {
        new HengerProgram().run();
    }
}
