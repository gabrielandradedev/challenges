import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] vals = {3600, 60};

        int n = in.nextInt();

        for (int val : vals) {
            int amount = n / val;
            n -= amount * val;

            System.out.print(amount + ":");
        }

        System.out.println(n);

    }

}
