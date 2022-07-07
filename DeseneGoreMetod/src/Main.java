import java.util.Scanner;

public class Main {

    /*
    Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
    Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
    Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
     Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
     */

    static int girilenSayiNegatif(int sayi){
        if(sayi <= 0){
            return sayi;
        }
        else {
            System.out.print(sayi + " ");
            return girilenSayiNegatif(sayi-5);
        }
    }

    static int girilenSayiPozitif(int sayiPozitif,int sayiNegatif){
        if(sayiPozitif > sayiNegatif){
            return sayiPozitif;
        }
        else {
            System.out.print(sayiPozitif + " ");
            return girilenSayiPozitif(sayiPozitif + 5,sayiNegatif);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı girin");
        int girilenSayi = scanner.nextInt();

        girilenSayiPozitif(girilenSayiNegatif(girilenSayi),girilenSayi);

    }
}
