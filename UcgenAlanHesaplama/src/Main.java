import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // değişkenlerimiz
        double a,b,c,u,alan;

        //kullanıcıdan kenar değerleri alalım
        Scanner scanner = new Scanner(System.in);

        System.out.println("a kenar uzunluğu giriniz ");
        a = scanner.nextDouble();

        System.out.println("b kenar uzunluğu giriniz ");
        b = scanner.nextDouble();

        System.out.println("c kenar uzunluğu giriniz ");
        c = scanner.nextDouble();

        u = (a+b+c)/2;

        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));

        System.out.println(alan);


    }
}
