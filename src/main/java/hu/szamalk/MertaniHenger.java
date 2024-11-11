package hu.szamalk;

public class MertaniHenger {
    private static int hengerDarab;
    private double sugar, magassag;

    public MertaniHenger(double sugar, double magassag) {
        MertaniHenger.hengerDarab++;
        this.sugar = sugar;
        this.magassag = magassag;
    }

    public static int getHengerDarab() {
        return hengerDarab;
    }

    public double terfogat(){
        return Math.pow(sugar,2)*Math.PI*magassag;
    }
    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getMagassag() {
        return magassag;
    }

    public void setMagassag(double magassag) {
        this.magassag = magassag;
    }

    @Override
    public String toString() {
        return "MertaniHenger{" +
                "sugar=" + sugar +
                ", magassag=" + magassag +
                '}';
    }
}
