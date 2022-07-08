import java.util.Scanner;

public class Main {

    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)){
                System.out.println(str + " palindromik bir kelime değildir.");
                return false;
            }

            i++;
            j--;
        }

        System.out.println(str + " palindromik bir kelimediir");

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen kelime giriniz");
        String girilenKelime = scanner.nextLine();


        System.out.println(isPalindrome(girilenKelime));
    }
}
