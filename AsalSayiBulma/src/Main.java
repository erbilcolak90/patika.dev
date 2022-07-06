public class Main {

    public static void main(String[] args) {

        int sayac = 0;

        for(int t=2;t<=100;t++)
        {
            int a = 0;
            for (int i = 2; i < t; i++)
            {
                if (t % i == 0)
                {
                    a = 1;
                    break;
                }
            }
            if(a==0)
            {
                System.out.print(t+"\n");
                sayac++;
            }
        }
    }
}
