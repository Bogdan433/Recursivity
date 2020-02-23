import java.util.ArrayList;

public class Produs {
    private String nume;
    private String descriere;
    private double pret;

    public String getNume() {
        return nume;
    }

    public String getDescriere() {
        return descriere;
    }

    public double getPret() {
        return pret;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public Produs(String nume, String descriere, double pret) {
        this.nume = nume;
        this.descriere = descriere;
        this.pret = pret;
    }
}



