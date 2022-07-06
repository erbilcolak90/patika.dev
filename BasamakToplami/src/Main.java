import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Bir Sayı Girin: ");

            int girilenSayi = scanner.nextInt();

            int adet = 0,toplam=0;

            while(girilenSayi != 0)
            {
                toplam=(girilenSayi%10)+toplam;
                girilenSayi /= 10;
                ++adet;
            }

            System.out.println("Basamak Toplamı: " + toplam);
        }
    }
