import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Değişkenler
        String kullaniciAdi;
        String parola;
        String tempPass;

        //kullanıcıdan kullanıcı adı bilgisi alalım
        //sistemde kullanıcı adı: patika  şifre:java123 olarak yer alsın.
        System.out.println("Kullanıcı adınızı girin");
        kullaniciAdi = scanner.nextLine();

        System.out.println("Parolanızı girin");
        parola = scanner.nextLine();

        if(kullaniciAdi.equals("patika") && parola.equals("java123")){
            System.out.println("Giriş başarılı");
        }
        else{
            System.out.println("Giriş başarısız \nşifrenizi sıfırlamak ister misiniz (evet/hayır)?");
            String sifreSifirlamaYanit= scanner.nextLine();

            if(sifreSifirlamaYanit.equals("evet")){
                System.out.println("Lütfen yeni şifrenizi girin.");
                tempPass = scanner.nextLine();

                if(tempPass.equals("java123")){
                    System.out.println("girilen şifre eski şifrenizle aynı olmamalı. Lütfen yeni şifre giriniz.");

                    tempPass = scanner.nextLine();
                    System.out.println("şifreniz oluşuruldu");
                }
                else{
                    System.out.println("şifre oluşturuldu");
                }
            }
            else{
                System.out.println("şifre oluşturulmadı.");
            }

        }

    }

}
