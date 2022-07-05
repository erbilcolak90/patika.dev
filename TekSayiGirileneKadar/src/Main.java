import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int girilenSayi,toplam=0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Lütfen bir sayı giriniz :");
            girilenSayi = scanner.nextInt();

            if(girilenSayi %4 == 0){
                toplam = girilenSayi + toplam;
            }
        }while (girilenSayi %2 == 0);
        System.out.println("Girilen sayılar içinde çift ve 4 ün katları olan sayıların toplamı :" + toplam);

    }
}
