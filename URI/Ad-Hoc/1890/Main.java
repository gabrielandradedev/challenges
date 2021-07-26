import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int c = in.nextInt();
            int d = in.nextInt();

            int x = 0;
            int y = 0;
            int z = 0;

            if (c > 0) {
                x = (int) Math.pow(26, c);
            }
            if (d > 0) {
                y = (int) Math.pow(10, d);
            }

            if (x != 0 && y != 0) {
                z = x * y;
            } else {
                z = x + y;
            }

            System.out.println(z);
        }
    }
}
