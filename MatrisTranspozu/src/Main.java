import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Oluşturmak istediğiniz matrisin satır sayısını girin?  ");
        int satir = scanner.nextInt();
        System.out.print("matrisin sütun sayısını girin ?  ");
        int sutun = scanner.nextInt();
        System.out.println("Oluşturulacak matrisin elemanlarını sırasıyla giriniz .");


        int[][] matris = new int[satir][sutun];

        for(int i =0  ; i < matris.length;i++){
            for(int j = 0 ; j < matris[i].length;j++)
                matris[i][j] = scanner.nextInt();
        }
        System.out.println("==================================");
        System.out.println("matris : ");
        System.out.println();

        for(int i =0  ; i < matris.length;i++){
            for(int j = 0 ; j < matris[i].length;j++)
                System.out.print(matris[i][j]+"   ");
            System.out.println();
        }
        System.out.println("");

        System.out.println("matrisin transpozu : ");

        System.out.println("");

        int[][] transpoze = new int[sutun][satir];

        for(int j = 0 ; j < matris[0].length;j++){
            for(int i =0  ; i < matris.length;i++){
                System.out.print(matris[i][j]+"   ");

            }
            System.out.println();
        }
        scanner.close();
    }

}
