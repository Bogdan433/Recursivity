import java.util.ArrayList;

public class Main5 {
    public static void main(String[] args) {
        Produs produs1 = new Produs("Mar", "", 2.3);
        Produs produs2 = new Produs("Adidasi", "", 10);

        ArrayList<Produs> listaDeProduse = new ArrayList<>();
        listaDeProduse.add(produs1);
        listaDeProduse.add(produs2);
        Cos cos = new Cos();
        double total = cos.calculeazaSuma(listaDeProduse);
        System.out.println("Pret total:" + total);

    }
}
