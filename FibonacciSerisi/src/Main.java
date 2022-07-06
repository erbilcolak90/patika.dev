import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n1=0,n2=1,n3,i,girilenSayi;

        System.out.println("N Sayısını Girin:");
        girilenSayi = reader.nextInt();
        System.out.print(n1+" "+n2);

        //ilk 2 sayı her zaman 0 ve 1 yazılmalıdır
        for(i=2;i<girilenSayi;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        System.out.println();
    }
}
