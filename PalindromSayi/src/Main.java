import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayi Giriniz : ");
        int palindrom = scanner.nextInt();

        int ilkDeger = palindrom;

        int uzunluk = String.valueOf(palindrom).length();

        int kalan,deger=0;

        for (int i = 0; i<uzunluk; i++){

            kalan = palindrom % 10;
            deger = deger * 10 + kalan;
            palindrom = palindrom /10;
        }

        if(deger == ilkDeger){
            System.out.println(deger + " Palindrom Sayidir.");
        }else{
            System.out.println(deger + " Palindrom Sayi Degildir.");
        }

    }
}
