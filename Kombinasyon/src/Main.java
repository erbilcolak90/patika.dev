import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı
        n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

        Java ile kombinasyon hesaplayan program yazınız.

        C(n,r) = n! / (r! * (n-r)!)
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("n değerini Giriniz");
        int n=scanner.nextInt();

        System.out.println("r değerini Giriniz");
        int r=scanner.nextInt();

        if(n<r){

            System.out.println("N Sayısı R Sayısından Büyük Olmalıdır. Lütfen Tekrar N Değerini Giriniz.");
            n=scanner.nextInt();

        }else {

            int nFaktoriyel = 1;
            int rFaktoriyel = 1;
            int farkFaktoriyel = 1;
            int fark = n - r;

            for (int i = 1; i <= n; i++) {

                nFaktoriyel = nFaktoriyel * i;
            }
            System.out.println("n Sayısının Faktöriyeli : " + nFaktoriyel);

            for (int j = 1; j <= r; j++) {

                rFaktoriyel = rFaktoriyel * j;
            }
            System.out.println("r Sayısının Faktöriyeli : " + rFaktoriyel);

            for (int k = 1; k <= fark; k++) {

                farkFaktoriyel = farkFaktoriyel * k;
            }
            System.out.println("(n-r)'nin Faktöriyeli : " + farkFaktoriyel);

            int carpim = rFaktoriyel * farkFaktoriyel;
            int kombinasyon = nFaktoriyel / carpim;

            System.out.println(n + " Sayısının " + r + "'li" + " Kombinasyonu = " + kombinasyon);

        }
    }

    }


