import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int girilenSayi,toplam=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz :");
        girilenSayi = scanner.nextInt();

        for(int i= 1 ; i < girilenSayi ; i++){
            if(girilenSayi % i == 0){
                toplam += i;
            }
        }

        if(girilenSayi == toplam){
            System.out.println(girilenSayi + " mükemmel bir sayıdır");
        }else {
            System.out.println(girilenSayi + " başka bir sayı deneyin...bu mükemmel değil.");
        }
    }
}
