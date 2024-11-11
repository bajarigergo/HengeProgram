package hu.szamalk;

public class MertaniHenger {
    private static int hengerDarab;
    private double sugar, magassag;

    public MertaniHenger(double sugar, double magassag) {
        this.sugar = sugar;
        this.magassag = magassag;
    }

    public int getHengerDarab() {
        return hengerDarab;
    }

    public double terfogat(){
        return 0.0;
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
                "hengerDarab=" + hengerDarab +
                ", sugar=" + sugar +
                ", magassag=" + magassag +
                '}';
    }
}
