import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int girilenSayi;
        int sira=0;
        double ortalama;
        double toplam =0;

        System.out.println("Lütfen bir sayı giriniz :");
        girilenSayi= scanner.nextInt();

        for(int i=0 ; i<=girilenSayi ; i++){
            if(i % 3 ==0 && i % 4 ==0){
                System.out.println("3 e ve 4 e bölünen sayı : "+ i);
                toplam += i;
                sira++;

            }
        }

        ortalama = toplam /sira;

        System.out.println("ortalama = " + ortalama);

    }
}
