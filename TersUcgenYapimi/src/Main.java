import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int girilenSayi;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz");
        girilenSayi=scanner.nextInt();

        for(int i=0;i<girilenSayi;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int t=2*girilenSayi-1;t>=(2*i+1);t--){
                System.out.print("*");

            }
            System.out.println();

        }




    }
}
