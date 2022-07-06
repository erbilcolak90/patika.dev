import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;

        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select = 0,paraYatirma,paraCekme;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("12345")){
                System.out.println("Sisteme başarıyla giriş yapıldı");
            }
            else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }

            while(true){
                System.out.println("işlemler : \n 1-Para Yatırma\n 2-Para Çekme\n 3-Bakiye Sorgulama\n 4-Cikis\n lütfen seçiminizi numara olarak tuşlayın");
                select = input.nextInt();

                switch (select){
                    case 1:
                        System.out.println("Yatırılacak tutarı girin : ");
                        paraYatirma = input.nextInt();
                        balance = balance + paraYatirma;
                        System.out.println("Yeni bakiyeniz : " + balance);
                        System.out.println("Üst menüye dönülüyor...");
                        break;
                    case 2:
                        System.out.println("Çekmek istediğiniz tutarı girin :");
                        paraCekme = input.nextInt();

                        if(balance >= paraCekme){
                            balance -= paraCekme;
                            System.out.println("Yeni bakiyeniz : " + balance);
                        }
                        else {
                            System.out.println("Bakiyenizden fazla tutar girdiniz.Üst menüye dönülüyor...");
                        }
                        break;
                    case 3:
                        System.out.println("Bakiyeniz : " + balance);
                        System.out.println("Üst menüye dönülüyor...");
                        break;

                    case 4:
                        System.out.println("Çıkış yapılıyor...");
                        System.exit(0);
                        break;

                }

            }


        }
    }
}
