import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int a = 0;
        int l = 0;

        for (int i = 0; i < n; i++) {
            int v = in.nextInt();

            if (v != l) {
                l = v;
                a++;
            }
        }

        System.out.println(a);

        in.close();

    }

}
