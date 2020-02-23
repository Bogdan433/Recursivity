import java.util.ArrayList;
        import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Caine caine1 = new Caine("bbb", "alb");
        Caine caine2 = new Caine("aaa");
        ArrayList<Caine> listaDeCaini = new ArrayList<>();
        listaDeCaini.add(caine1);
        listaDeCaini.add(caine2);

        for (int index = 0; index <listaDeCaini.size() ; index++) {
            Caine caineDinLista = listaDeCaini.get(index);
            String numeCaine = caineDinLista.getNume();
            System.out.println(numeCaine);

        }
    }
}
