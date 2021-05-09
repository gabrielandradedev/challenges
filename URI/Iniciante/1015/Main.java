import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double p1x = in.nextDouble();
        double p1y = in.nextDouble();
        double p2x = in.nextDouble();
        double p2y = in.nextDouble();

        double distance = Math.sqrt(
            Math.pow(p2x - p1x, 2.0) +
            Math.pow(p2y - p1y, 2.0)
        );

        System.out.printf("%.4f%n", distance);

        in.close();

    }

}
