import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int matematik,fizik,kimya,turkce,tarih,muzik;

        //Kullanıcıdan sayısal değerler alabilmek için nextInt kullanıyoruz.

        System.out.println("matematik notunuz :");
        matematik = scanner.nextInt();

        System.out.println("fizik notunuz :");
        fizik= scanner.nextInt();

        System.out.println("kimya notunuz :");
        kimya = scanner.nextInt();

        System.out.println("turkce notunuz :");
        turkce = scanner.nextInt();

        System.out.println("tarih notunuz :");
        tarih = scanner.nextInt();

        System.out.println("muzik notunuz :");
        muzik = scanner.nextInt();

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);

        double ortalama = (toplam / 6.0);


        String gectiMi = (ortalama>= 60) ? "Sınıfı gecti" : "Sınıfta kaldı";

        System.out.println(gectiMi);



    }
}
