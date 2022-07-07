public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;
        float result = 0;

        for(int i : numbers){
            result = 1f /i;
        }
        sum = numbers.length /result;

        System.out.println("Harmonik hesaplama : " + sum);




    }
}
