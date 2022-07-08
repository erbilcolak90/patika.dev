import java.util.Scanner;

public class MineSweeper {

    int satirSayisi;
    int sutunSayisi;
    int mayinSayisi;
    char[][] oyunTahtasi;
    char[][] oyunHaritasi;
    int satir;
    int sutun;
    int yakindakiMayinSayisi;

    MineSweeper(int satirSayisi, int sutunSayisi) {
        this.satirSayisi = satirSayisi;
        this.sutunSayisi = sutunSayisi;
        this.oyunTahtasi = new char[satirSayisi][sutunSayisi];
        this.oyunHaritasi = new char[satirSayisi][sutunSayisi];
        this.mayinSayisi = ((sutunSayisi * satirSayisi) / 4);


    }

    void minePosition() {
        for (int i = 0; i < mayinSayisi; i++) {
            while (true) {
                int a = (int) (Math.random() * satirSayisi);
                int b = (int) (Math.random() * sutunSayisi);
                if (oyunHaritasi[a][b] != '*')
                    oyunHaritasi[a][b] = '*';
                break;
            }
        }
    }

    void oyunTahtasiniYazdir() {
        for (int i = 0; i < this.oyunTahtasi.length; i++) {
            for (int j = 0; j < this.oyunTahtasi[i].length; j++) {
                System.out.print(this.oyunTahtasi[i][j] + " ");
            }
            System.out.println();
        }
    }
    void oyunHaritasiniYazdir() {
        System.out.println("Mayın Tarlasının Konumu");
        minePosition();
        for (int i = 0; i < oyunHaritasi.length; i++) {
            for (int j = 0; j < oyunHaritasi[0].length; j++) {
                if (oyunHaritasi[i][j] != '*') {
                    oyunHaritasi[i][j] = '-';
                }
                System.out.print(oyunHaritasi[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("*-*-*-*-*-*-*");
    }

    void oyunTahtasindakiEleman() {
        for (int i = 0; i < oyunTahtasi.length; i++) {
            for (int j = 0; j < oyunTahtasi[i].length; j++) {
                oyunTahtasi[i][j] = '-';
            }
        }
    }

    boolean kontrol() {
        for (int i = 0; i < oyunHaritasi.length; i++) {
            for (int j = 0; j < oyunHaritasi[0].length; j++) {
                if (oyunHaritasi[i][j] == '-')
                    return false;
            }
        }
        return true;
    }



    void kullaniciGirilenBilgi() { // Kullanıcıdan bilgi alma
        boolean isTrue = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("İstediğiniz noktanın koordinat bilgisini satır ve sutun olarak girin");
        System.out.print("Satır girin:");
        satir = (scanner.nextInt() - 1);
        System.out.print("Sutun girin:");
        sutun = (scanner.nextInt() - 1);
        while (!isTrue) {
            if (satir < 0 || satir > oyunTahtasi.length - 1 || sutun < 0 || sutun > oyunTahtasi[0].length - 1) {
                System.out.println("Hatalı giriş yaptınız lütfen tekrar giriniz.");
                System.out.print("Satır giriniz:");
                satir = scanner.nextInt() - 1;
                System.out.print("Sutun giriniz:");
                sutun = scanner.nextInt() - 1;
            } else
                isTrue = true;
        }
        System.out.println("*-*-*-*-*-*-*-*-*");
    }

    public int haritadakiMayinlar() {
        // Seçilen alana yakın kaç tane yıldız olduğunun bilgisi
        yakindakiMayinSayisi = 0;
        if (sutun + 1 < oyunHaritasi[0].length - 1) {
            if (oyunHaritasi[satir][sutun + 1] == '*')
                yakindakiMayinSayisi++;
        }

        else if (sutun - 1 >= 0) {
            if (oyunHaritasi[satir][sutun - 1] == '*')
                yakindakiMayinSayisi++;
        }

        else if (satir + 1 < oyunHaritasi.length - 1) {
            if (oyunHaritasi[satir + 1][sutun] == '*')
                yakindakiMayinSayisi++;
        }

        else if (satir - 1 >= 0) {
            if (oyunHaritasi[satir - 1][sutun] == '*')
                yakindakiMayinSayisi++;
        }
        else if (satir - 1 >= 0 && sutun - 1 >= 0) {
            if (oyunHaritasi[satir - 1][sutun - 1] == '*')
                yakindakiMayinSayisi++;
        }
        else if (satir - 1 >= 0 && sutun + 1 < oyunHaritasi[0].length - 1)
            if (oyunHaritasi[satir - 1][sutun + 1] == '*')
                yakindakiMayinSayisi++;
        else if (satir + 1 < oyunHaritasi.length - 1 && sutun - 1 >= 0)
            if (oyunHaritasi[satir + 1][sutun - 1] == '*')
                yakindakiMayinSayisi++;
        else if (satir + 1 < oyunHaritasi.length - 1 && sutun + 1 < oyunHaritasi[0].length - 1)
            if (oyunHaritasi[satir + 1][sutun + 1] == '*')
                yakindakiMayinSayisi++;
        return yakindakiMayinSayisi;
    }

    public void oyunTahtasiniDegistir() {

        switch (haritadakiMayinlar()) {

            case 0:
                oyunTahtasi[satir][sutun] = '0';
                oyunHaritasi[satir][sutun] = '0';
                break;
            case 1:
                    oyunTahtasi[satir][sutun] = '1';
                oyunHaritasi[satir][sutun] = '1';
                break;

            case 2:
                oyunTahtasi[satir][sutun] = '2';
                oyunHaritasi[satir][sutun] = '2';
                break;

            case 3:
                oyunTahtasi[satir][sutun] = '3';
                oyunHaritasi[satir][sutun] = '3';
                break;
            case 4:
                oyunTahtasi[satir][sutun] = '4';
                oyunHaritasi[satir][sutun] = '4';
                break;

            case 5:
                oyunTahtasi[satir][sutun] = '5';
                oyunHaritasi[satir][sutun] = '5';
                break;

            case 6:
                oyunTahtasi[satir][sutun] = '6';
                oyunHaritasi[satir][sutun] = '6';
                break;

        }

    }

    public void run() {
        oyunHaritasiniYazdir();
        // Yıldızlar oyunharitası arrayinde yıldızlı hali ekrana basıyoruz
        System.out.println("Mayın Tarlasına Hoşgeldiniz ! ");
        System.out.println("*-*-*-*-*-*-*-*-*");
        oyunTahtasindakiEleman();
        oyunTahtasiniYazdir();
        while (true) {
            this.kullaniciGirilenBilgi();
            if (oyunHaritasi[satir][sutun] == '*') {
                System.out.println("Mayına bastın");
                System.out.println("Oyun Bitti!");
                break;
            } else {
                oyunTahtasiniDegistir();
                oyunTahtasiniYazdir();
                if ((kontrol())) {
                    System.out.println("Oyunu Kazandın!");
                    break;
                }
            }
        }

    }

}
