import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {55,55,18,18,18,33,33,10,9};

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

        System.out.println("\n");

        for(int i = 0 ; i< array.length ; i++){
            if(repeatArray[i] > 1){
                if(array[i] != 0){
                    System.out.println(array[i] + " sayı " + repeatArray[i] + " kez tekrar etti ");
                }
            }
        }


    }
}
