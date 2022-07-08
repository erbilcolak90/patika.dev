import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = {14,12,14,22,12,22,44,12,92};

        int[] repeatArray = new int[9];

        for(int i = 0 ; i< array.length; i++){
            repeatArray[i] = 1;
        }
        for(int i = 0; i< array.length ; i++){
            for(int j = 0 ; j < array.length ; j++){
                if(i != j && array[i] == array[j]){
                    repeatArray[i]++;
                }
            }
        }

        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0; j < array.length ; j++){
                if(i != j && array[i] == array[j]){
                    array[j] = 0;
                }
            }
        }
        System.out.println("Array deki tekrarsız numaralar");
        for(int t: array){
            if( t != 0){
                System.out.print(t);
                System.out.print(",");
            }
        }
        System.out.println("\n");

        for(int i = 0 ; i< array.length ; i++){
            if(repeatArray[i] > 1){
                if(array[i] != 0){
                    if(array[i] % 2 == 0){
                        System.out.println(array[i] + " sayısı 2 ye bölünmekte olup " + repeatArray[i] + " kez tekrar etti ");
                    }

                }
            }
        }


    }
}
