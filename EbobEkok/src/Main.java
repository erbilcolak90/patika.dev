import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int ilkSayi,ikinciSayi,kucukSayi;
        int ekok = 1,ebob = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("ilk sayıyı girin :");
        ilkSayi = scanner.nextInt();

        System.out.println("ikinci sayıyı girin :");
        ikinciSayi = scanner.nextInt();

        if(ilkSayi < ikinciSayi){
            kucukSayi = ilkSayi;
        }
        else {
            kucukSayi = ikinciSayi;
        }

        int i = kucukSayi;

        while(i>= 1){
            if(ilkSayi % i == 0 && ikinciSayi % i == 0){
                ebob = i;
                System.out.println("Ebob  :" + ebob);
                break;
            }

            i--;
        }

        int j = 1;
        while (j <= (ilkSayi * ikinciSayi)){
            if(j % ilkSayi == 0 && j % ikinciSayi == 0){
                ekok = j;
                System.out.println("Ekok :" + ekok);
                break;
            }
            j++;
        }

    }
}
