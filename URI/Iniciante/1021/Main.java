import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner in = new Scanner(System.in);

        int[] values = new int[12];
        int[] divisions = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1};

        float v = 100 * in.nextFloat();
        in.close();

        for (int i = 0; i < 12; i++) {
            values[i] = Math.floorDiv((int) v, divisions[i]);
            v %= divisions[i];
        }

        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00%n", values[0]);
        System.out.printf("%d nota(s) de R$ 50.00%n", values[1]);
        System.out.printf("%d nota(s) de R$ 20.00%n", values[2]);
        System.out.printf("%d nota(s) de R$ 10.00%n", values[3]);
        System.out.printf("%d nota(s) de R$ 5.00%n", values[4]);
        System.out.printf("%d nota(s) de R$ 2.00%n", values[5]);
        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00%n", values[6]);
        System.out.printf("%d moeda(s) de R$ 0.50%n", values[7]);
        System.out.printf("%d moeda(s) de R$ 0.25%n", values[8]);
        System.out.printf("%d moeda(s) de R$ 0.10%n", values[9]);
        System.out.printf("%d moeda(s) de R$ 0.05%n", values[10]);
        System.out.printf("%d moeda(s) de R$ 0.01%n", values[11]);

    }

}
