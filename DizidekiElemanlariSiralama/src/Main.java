import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size,temp = 0;

        System.out.println("Lütfen oluşturmak istediğiniz array boyutunu girin :");
        size = scanner.nextInt();

        if(size>0){
            int[] array = new int[size];

            for(int i = 0 ; i< array.length ; i++){
                System.out.println( "" +(i+1) + ". elemanı girin ");
                array[i] = scanner.nextInt();
            }


            System.out.println("sıralanmamış array "+Arrays.toString(array));

            for(int i = 0 ; i< array.length ; i++){
                for(int j = i+ 1 ; j< array.length ; j++){
                    if(array[i] > array[j]){
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }

            System.out.println("sıralanmış array : " + Arrays.toString(array));
        }
        else {
            System.out.println("Hatalı parametre girdiniz. Programı tekrarlayın");
            System.exit(0);
        }


    }
}
