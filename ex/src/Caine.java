//clasa Caine
//cosntructor cu nume;
//consturctr cu nume si culoare
//o metoda de schimbare a numelui
public class Caine {
    private String nume;
    private String culoare;

    public Caine(String nume) {
        this.nume = nume;
    }

    public Caine(String nume, String culoare) {
        this.nume = nume;
        this.culoare = culoare;
    }

    public void setNume(String noulNume) {
        this.nume = noulNume;
    }
    public String getNume(){
        return this.nume;
    }

}
