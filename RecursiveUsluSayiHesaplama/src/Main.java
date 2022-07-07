import java.util.Scanner;

public class Main {

    static int sonuc = 1;

    static int us(int x, int y){

        if(x == 0){
            return 1;
        }
        else {
            sonuc *= y;
            us(x-1,y);
        }
        return sonuc;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x,y;

        System.out.println("Lütfen üssü alınacak sayıyı girin");
        y = scanner.nextInt();

        System.out.println("üs sayısını girin");
        x = scanner.nextInt();

        System.out.println(us(x,y));

    }

}
