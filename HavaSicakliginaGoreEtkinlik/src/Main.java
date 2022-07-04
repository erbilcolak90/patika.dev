import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Koşullar :

        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
        Ödev
        Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
         */

        //değişken
        double sicaklik;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hava sıcaklığını giriniz :");
        sicaklik = scanner.nextDouble();

        //değişkene ait koşul durumları ve program önerileri.
        //15 dereceyi 2 koşulda içerdiği için 15 derece olması durumunda 2 etkinliği de öneriye sunmaktadır.
        if(sicaklik < 5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if (sicaklik >=5 && sicaklik < 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (sicaklik == 15) {
            System.out.println("Sinemaya veya Pikniğe gidebilirsiniz.");
        } else if (sicaklik >15 && sicaklik <=25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        }
        else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

    }
}
