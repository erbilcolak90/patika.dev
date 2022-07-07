import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] list ={15,12,788,1,-1,-778,2,0};
        int min = list[0];
        int max = list[0];

        System.out.println(Arrays.toString(list));
        System.out.println("Bir sayı giriniz : " );
        int girilenSayi = scanner.nextInt();

        Arrays.sort(list);
        for(int i : list){
            if(i<girilenSayi){
                min = i;
            } else if (i > girilenSayi) {
                max = i;
                break;
            }
        }
        System.out.println("Girilen sayıya küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıya büyük en yakın sayı : " + max);
    }
}
