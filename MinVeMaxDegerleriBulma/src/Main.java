import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sayac,girilenSayi,minDeger= 1, maxDeger=1;

        System.out.println("Kaç adet sayı gireceğinizi yazın :");
        sayac = scanner.nextInt();

        for(int i = 1; i <= sayac ; i ++){
            System.out.println(i + ". sayıyı girin");
            girilenSayi = scanner.nextInt();

            if(i == 1){
                maxDeger = girilenSayi;
                minDeger = girilenSayi;
            } else if (girilenSayi > maxDeger) {
                maxDeger = girilenSayi;
            }else  {
                minDeger = girilenSayi;
            }
        }

        System.out.println("En büyük sayı : " + maxDeger);
        System.out.println("En küçük sayı : "+ minDeger);

    }
}
