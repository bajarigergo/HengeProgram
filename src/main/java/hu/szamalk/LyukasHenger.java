package hu.szamalk;

public class LyukasHenger extends TomorHenger{
    private double falvastagsag;

    public LyukasHenger(double sugar, double magassag, double falvastagsag) {
        this(sugar, magassag,1,falvastagsag);

    }

    public LyukasHenger(double sugar, double magassag, double fajsuly, double falvastagsag) {
        super(sugar, magassag, fajsuly);
        this.falvastagsag = falvastagsag;
    }

    public double terfogat(){
        double sugarTortenet = this.getSugar();
        setSugar(this.getSugar()-falvastagsag);
        double belso = super.terfogat();
        setSugar(sugarTortenet);

        return super.terfogat()-belso;
    }
    @Override
    public String toString() {
        String os = super.toString();
        return os + " <-- LyukasHenger{" +
                "falvastagsag=" + falvastagsag +
                '}';

    }
}
