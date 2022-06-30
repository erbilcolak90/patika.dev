import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            //Değişkenlerimiz.
            double boy,kilo,indeks;

            Scanner scanner = new Scanner(System.in);
        System.out.println("Kilonuzu girin : ");
         kilo = scanner.nextDouble();

        System.out.println("Boyunuzu girin (metre cinsinden) : ");
         boy = scanner.nextDouble();

        indeks = kilo / (boy*boy);

        System.out.println("Vücut indeksiniz : " + indeks);


    }
}
