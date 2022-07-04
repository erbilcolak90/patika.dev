import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //değişkenler
        int a,b,c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci sayıyı girin :");
        a = scanner.nextInt();

        System.out.println("İkinci sayıyı girin");
        b = scanner.nextInt();

        System.out.println("Üçüncü sayıyı girin");
        c = scanner.nextInt();

        if(a < b && a < c){
            if(b < c){
                System.out.println("Küçükten Büyüğe Doğru Siralama " + a +"<"+b+"<"+ c );
            }
            else {
                System.out.println("Küçükten Büyüğe Doğru Siralama " + a +"<"+ c +"<"+b );
            }
        } else if (b < a && b < c) {
            if(a < c){
                System.out.println("Küçükten Büyüğe Doğru Siralama " + b +"<"+ a +"<"+c );
            }
            else {
                System.out.println("Küçükten Büyüğe Doğru Siralama " + b +"<"+ c +"<"+a );
            }
        }
        else if (c < a && c < b ){
            if(a < b){
                System.out.println("Küçükten Büyüğe Doğru Siralama " + c +"<"+ a +"<"+b );
            }
            else {
                System.out.println("Küçükten Büyüğe Doğru Siralama " + c +"<"+ b +"<"+a );
            }
        }

    }
}
