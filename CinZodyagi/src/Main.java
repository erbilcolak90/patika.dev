import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

        Doğum Tarihi %12 = 0 ➜ Maymun
        Doğum Tarihi %12 = 1 ➜ Horoz
        Doğum Tarihi %12 = 2 ➜ Köpek
        Doğum Tarihi %12 = 3 ➜ Domuz
        Doğum Tarihi %12 = 4 ➜ Fare
        Doğum Tarihi %12 = 5 ➜ Öküz
        Doğum Tarihi %12 = 6 ➜ Kaplan
        Doğum Tarihi %12 = 7 ➜ Tavşan
        Doğum Tarihi %12 = 8 ➜ Ejderha
        Doğum Tarihi %12 = 9 ➜ Yılan
        Doğum Tarihi %12 = 10 ➜ At
        Doğum Tarihi %12 = 11 ➜ Koyun
         */

        Scanner scanner = new Scanner(System.in);

        //Değişkenler
        int dogumGunu,zodiacNo;

        System.out.println("Doğum yılınızı girin ");
        dogumGunu = scanner.nextInt();

        zodiacNo = dogumGunu % 12;

        if(zodiacNo == 0){
            System.out.println("Çin zodyağı burcunuz Maymun");
        } else if (zodiacNo == 1) {
            System.out.println("Çin zodyağı burcunuz Horoz");
        } else if (zodiacNo == 2) {
            System.out.println("Çin zodyağı burcunuz Köpek");
        } else if (zodiacNo == 3) {
            System.out.println("Çin zodyağı burcunuz Domuz");
        } else if (zodiacNo == 4) {
            System.out.println("Çin zodyağı burcunuz Fare");
        } else if (zodiacNo == 5) {
            System.out.println("Çin zodyağı burcunuz Öküz");
        } else if (zodiacNo == 6) {
            System.out.println("Çin zodyağı burcunuz Kaplan");
        } else if (zodiacNo == 7) {
            System.out.println("Çin zodyağı burcunuz Tavşan");
        } else if (zodiacNo == 8 ) {
            System.out.println("Çin zodyağı burcunuz Ejderha");
        } else if (zodiacNo == 9) {
            System.out.println("Çin zodyağı burcunuz Yılan");
        } else if (zodiacNo == 10) {
            System.out.println("Çin zodyağı burcunuz At");
        } else if (zodiacNo == 11) {
            System.out.println("Çin zodyağı burcunuz Koyun");
        }


    }
}
