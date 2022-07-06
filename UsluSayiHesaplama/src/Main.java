import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int girilenSayi,usSayisi;
        int toplam = 1;

        System.out.println("Lütfen üssü alınacak sayıyı girin");
        girilenSayi = scanner.nextInt();

        System.out.println("Lütfen üs sayısını girin");
        usSayisi = scanner.nextInt();

        int i =1;


        for(i =1; i<=usSayisi ; i++){
           toplam *= girilenSayi;
        }
        System.out.println(girilenSayi+ "sayısının " + usSayisi + ". üssü" + " = " + toplam);

    }
}
