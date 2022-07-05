import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int girilenSayi;

        System.out.println("Lütfen bir sayı giriniz ");
        girilenSayi = scanner.nextInt();

        System.out.println(girilenSayi + "'dan küçük 4 ün kuvvetleri");
        for(int i =1; i<=girilenSayi ; i*=4){
            System.out.println(i + " ");
        }

        System.out.println(girilenSayi + "'dan küçük 5 in kuvvetleri ");
       for (int i =1 ; i<=girilenSayi; i*=5){
           System.out.println(i + " ");
       }

    }
}
