import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Satır sayısını giriniz:");
        int satirSayisi= scan.nextInt();
        System.out.print("Sutun sayısını giriniz:");
        int sutunSayisi= scan.nextInt();
        MineSweeper minesweeper = new MineSweeper(satirSayisi, sutunSayisi);
        minesweeper.run();
    }
    }


