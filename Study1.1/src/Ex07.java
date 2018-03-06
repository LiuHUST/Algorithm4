import static sun.misc.Version.println;

public class Ex07 {
    public static void main(String[] args) {



        int sum = 0;
        for (int i = 1; i < 1000; i++)
            for (int j = 0; j < i; j++)
                sum++;
        System.out.println(sum);

        int sum2 = 0;
        for(int i =1; i < 1000;i *= 2)
            for(int j = 0;j < 1000;j++)
                sum2++;
        System.out.println(sum2);

        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > 0.001)
            t = (9.0 / t + t) / 2.0;
        System.out.printf("%.5f", t);


    }
}