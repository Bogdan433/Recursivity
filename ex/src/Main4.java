import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Ce optiune alegeti?");
        String optiune = "on";
        System.out.println("+ Suma");
        System.out.println("- Diferenta");
        System.out.println("* Produsul");
        System.out.println("/ Impartirea");
        optiune = scanner.nextLine();
        if (optiune.equals("+")) {
            System.out.println("Alegeti primul numar");
            int a = scanner.nextInt();
            System.out.println("Alegeti al doilea numar");
            int b = scanner.nextInt();
            int suma = calculator.getSum(a, b);
            System.out.println(suma);
        } else if (optiune.equals("-")) {
            System.out.println("Alegeti primul numar");
            int a = scanner.nextInt();
            System.out.println("Alegeti al doilea numar");
            int b = scanner.nextInt();
            int diferenta = calculator.getDif(a, b);
            System.out.println(diferenta);

        } else if (optiune.equals("*")) {
            System.out.println("Alegeti primul numar");
            int a = scanner.nextInt();
            System.out.println("Alegeti al doilea numar");
            int b = scanner.nextInt();
            int produs = calculator.getProd(a, b);
            System.out.println(produs);

        } else if (optiune.equals("/")) {
            System.out.println("Alegeti primul numar");
            int a = scanner.nextInt();
            System.out.println("Alegeti al doilea numar");
            int b = scanner.nextInt();
            int impartire = calculator.getImp(a, b);
            System.out.println(impartire);

        }
    }
}
