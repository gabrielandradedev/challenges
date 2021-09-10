import java.util.Scanner;

public class Main {

    private static final Scanner IN = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            long a = IN.nextLong();
            long b = IN.nextLong();

            if (a == 0 && b == 0) {
                break;
            }

            long c = a * 3 - a - b;

            System.out.println(c);
        }

        IN.close();
    }
}
