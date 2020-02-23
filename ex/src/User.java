public class User {
    public String nume;
    private String prenume;
    private int varsta;

    public User(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    public User(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;

    }

    public void merge() {
        System.out.println("Utilizatorul merge...");
    }

    public void spune(String cuvant) {
        System.out.println("Spune " + cuvant);
    }

    public int calculeazaSuma(int num1, int num2) {
        int rezultat = num1 + num2;
        return rezultat;
    }
    public int getNumeLength(){
        return this.nume.length();
    }
    public void setNume(String noulNume){
        this.nume = noulNume;
    }
}
