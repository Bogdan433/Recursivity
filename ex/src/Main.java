public class Main {
    public static void main(String[] args) {

        User user = new User("Ionescu","Gabriel");
        user.merge();
        user.spune("Hello");
        int rezzultatSuma = user.calculeazaSuma(2,3);
        int length = user.getNumeLength();
        System.out.println("Dimensiunea este:" + length);
        System.out.println(user.nume);
        user.setNume("Alex");
        System.out.println("dupa schimbare:" + user.nume);

    }
}
