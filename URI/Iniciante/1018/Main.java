import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] vals = {100, 50, 20, 10, 5, 2, 1};

        int n = in.nextInt();

        System.out.println(n);

        for (int val : vals) {
            int amount = n / val;
            n -= amount * val;

            System.out.println(amount + " nota(s) de R$ " + val + ",00");
        }

    }

}
