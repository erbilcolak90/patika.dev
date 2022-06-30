import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenlerimiz.
        int r,a;
        double alan,pi = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Yarıçap değeri girin :");
        r = scanner.nextInt();

        System.out.println("Merkez açıyı girin : ");
        a = scanner.nextInt();

        //Formül : (𝜋 * (r*r) * 𝛼) / 360
        alan =(pi * (r*r) * a)/360;

        System.out.println("Dairenin alanı : " + alan);


    }
}
