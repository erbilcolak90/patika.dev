import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i,b,c,d,e,f;
        System.out.println("Lütfen bir sayi giriniz");
         c =scanner.nextInt();
        //yıldızlı elmasın üst kısmı
        for (i=1;i<=c;i++)
        {
            //ekranda sol tarafındaki boşlukları için bu döngümüzü kullanıyoruz.
            for (b=c;b>i;b--)
            {
                System.out.print(" ");
            }
            //yıldız elmas şeklimizi çıkartıyoruz ve yıldızlar arasındaki boşlukları belirliyoruz
            for (d = 1; d <=i ; d++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        //Yıldızlı elmasın alt kısmı için bu döngümüzü kullanıyoruz
        for (b=1;b<=c;b++)
        {
            //Yıldızlı elmasın altta kalan bölümünün sol tarafındaki boşlukları ayarlıyoruz.
            for (e =1 ; e <=b; e++)
            {
                System.out.print(" ");
            }
            //yıldızlar ve elmas arasındaki boşlukları ayarlıyoruz.
            for (f = c; f >b ; f--)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
