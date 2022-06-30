import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Ürünlerin Kilogram ücretleri
        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL
         */

        //değişkenler
        double armut,elma,domates,muz,patlıcan,toplamTutar;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Armut kaç kilo ? :");
        armut = scanner.nextDouble();

        System.out.println("Elma kaç kilo ? :");
        elma = scanner.nextDouble();

        System.out.println("Domates kaç kilo ? :");
        domates = scanner.nextDouble();

        System.out.println("Muz kaç kilo ? :");
        muz = scanner.nextDouble();

        System.out.println("Patlıcan kaç kilo ? : ");
        patlıcan = scanner.nextDouble();

        toplamTutar = (armut * 2.14)+(elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlıcan * 5.00);

        System.out.println("Toplam tutar : " + toplamTutar);








    }
}
