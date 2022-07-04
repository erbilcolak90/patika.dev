import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
 Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
 Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
 Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre
 müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
         */

        Scanner scanner = new Scanner(System.in);

        int km,age,roadType;
        double price;
        double costByPerDistance= 0.10d;

        System.out.println("Lütfen mesafeyi Km cinsinden girin");
        km = scanner.nextInt();

        System.out.println("Yaşınızı girin");
        age = scanner.nextInt();

        System.out.println("Yolculuk türünün rakamını girin .(1-Tek yön : 2- Gidiş-Dönüş) ");
        roadType = scanner.nextInt();

        if(km <0 || age <0 || roadType !=1 && roadType !=2){
            System.out.println("Hatalı veri girdiniz.");
        }

        price = km * costByPerDistance;

        if(age < 12){

            price = price /2;

        } else if (age < 24) {
            price = price - (price * 0.1);
        } else if (age > 65) {
            price = price - (price * 0.3);
        }

        if(roadType == 2){
            price = price - (price * 0.2);

            //gidiş dönüş bilet için fiyatın 2 katını alıyoruz.
            price = price * 2;
        }

        System.out.println("Bilet tutarı : " + price);

    }
}
