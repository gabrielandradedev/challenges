import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        double y = in.nextDouble();

        System.out.printf("%.3f km/l%n", (x / y));

        in.close();

    }

}
