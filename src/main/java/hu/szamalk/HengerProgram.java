package hu.szamalk;

import hu.szamalk.MertaniHenger;
import java.util.ArrayList;
import java.util.List;

public class HengerProgram {
    private List<MertaniHenger> hengerek;

    public HengerProgram() {
        hengerek = new ArrayList<>();
        hengerek.add(new MertaniHenger(3,3));
        hengerek.add(new TomorHenger(3,3,2));
        hengerek.add(new LyukasHenger(1,1,1,1));
        hengerek.add(new LyukasHenger(1,1,1,.5));
        hengerek.add(new LyukasHenger(1,1,1,.9));

        //for (MertaniHenger henger : hengerek){
        //    System.out.println(henger);
        //}
        for (MertaniHenger henger : this.lista()) {
            System.out.println(henger);
        }
        System.out.println("Hengerek átlagtérfogata: "+ this.atlagTerfogat());

        System.out.println("Hengerek átlagtérsúlya: "+ this.csovekSulya());

    }

    public double atlagTerfogat() {
    double terfogatOsszes = 0;
    for (MertaniHenger henger : this.lista()) {
            terfogatOsszes += henger.terfogat();
        }
    return terfogatOsszes / (doubl) MertaniHenger.getHengerDarab();
    }
    public double csovekSulya() {
        double osszTomeg = 0;
        for (MertaniHenger henger : this.lista()) {
            if (henger.getClass()==LyukasHenger.class){
                osszTomeg += henger.terfogat()*((LyukasHenger) henger).getFajsuly();
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
