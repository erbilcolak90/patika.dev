import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int girilenSayi;

        System.out.println("Bir sayı giriniz :");
        girilenSayi = scanner.nextInt();
        double toplam =0;

        for(double i = 1; i<=girilenSayi ; i++){
            toplam = toplam+ (1/i);
        }

        System.out.println("Girilen sayıya ait harmonik hesaplama : "+ toplam) ;
    }
}
