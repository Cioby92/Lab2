package Packets.Classes;

/**
 * Created by Ciobotaru on 09.11.2014.
 */
public class Caine {
    String nume;

    public String getMediuNatural() {
        return MediuNatural;
    }

    public void setMediuNatural(String mediuNatural) {
        MediuNatural = mediuNatural;
    }

    String MediuNatural;

    public String getNume() {
        return nume;
    }

    public int getNr_identificare() {
        return nr_identificare;
    }

    public void setNr_identificare(int nr_identificare) {
        this.nr_identificare = nr_identificare;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    int nr_identificare;

    public Caine(int nr_identificare, String nume) {
        this.nr_identificare = nr_identificare;
        this.nume = nume;
    }


}
