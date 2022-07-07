import java.util.Scanner;

public class Main {

  static boolean asalMi(int girilenSayi,int i ){

      if(girilenSayi <= 2){
          return ((girilenSayi == 2) ? true : false);
      } else if (girilenSayi % i == 0) {
          return false;
      } else if (i * i > girilenSayi) {
          return true;
      }
      return  asalMi(girilenSayi,i+1);
  }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz :");
        int girilenSayi = scanner.nextInt();

        if(asalMi(girilenSayi,2)){
            System.out.println(girilenSayi + " sayısı bir asal sayıdır.");
        }
        else {
            System.out.println(girilenSayi + " sayısı asal sayı değildir.");
        }
    }
}
