import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
        Geçme Notu : 55
        Ödev
        Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
         */

        //Değişkenler
        int matematik,fizik,turkce,kimya,muzik;
        double ortalama;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik notunuz :");
        matematik = scanner.nextInt();

        System.out.println("Fizik notunuz :");
        fizik = scanner.nextInt();

        System.out.println("Türkçe notunuz : ");
        turkce = scanner.nextInt();

        System.out.println("Kimya notunuz :");
        kimya = scanner.nextInt();

        System.out.println("Müzik notunuz :");
        muzik = scanner.nextInt();

        //Notların 0-100 aralığı dışında olma koşulları
        if(matematik < 0 || matematik > 100){
            matematik = 0;
        }
        if(fizik < 0 || fizik > 100){
            fizik = 0;
        }
        if(turkce < 0 || turkce > 100){
            turkce = 0;
        }
        if(kimya < 0 || kimya > 100){
            kimya = 0;
        }
        if(muzik < 0 || muzik > 100){
            muzik = 0;
        }

        ortalama = (matematik+fizik+turkce+kimya+muzik)/5;

        if(ortalama < 55){
            System.out.println("ortalamanız sınıfı geçmek için yeterli değil");
        }
        else {
            System.out.println("Tebrikler sınıfı geçtiniz.");
        }
        System.out.println("Ortalamanız : " + ortalama);
    }

}
