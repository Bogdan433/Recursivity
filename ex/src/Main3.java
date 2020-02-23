import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Televizor televizor = new Televizor(50,0);
        System.out.println(televizor.getCanal());
        televizor.setCanal(2);
        System.out.println("dupa schimbare:" + televizor.getCanal());
        System.out.println(televizor.getVolum());
        televizor.marireVolum();
        System.out.println("dupa schimbare:" + televizor.getVolum() );
        System.out.println(televizor.getVolum());
        televizor.micsorareVolum();
        System.out.println("dupa schimbare:" + televizor.getVolum());
    }
}
