import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //değişkenler
        double girilenTutar,kdvTutar,kdvliTutar,kdvOran;

        System.out.println("Ücret giriniz : ");
        girilenTutar = scanner.nextDouble();


        // KDV tipini girilen tutara göre belirleyeceğiz.
        boolean kdvTipi = (0<=girilenTutar) && (1000>= girilenTutar);
        kdvOran = kdvTipi ? 0.18 : 0.08;

        kdvTutar = girilenTutar * kdvOran ;
        kdvliTutar = kdvTutar + girilenTutar;

        System.out.println("Kdv oranı = " + kdvOran);
        System.out.println("Kdv'li tutar = " + kdvliTutar);








    }
}
