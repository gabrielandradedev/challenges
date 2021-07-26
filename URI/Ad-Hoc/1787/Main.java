import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {
            int n = in.nextInt();

            if (n == 0) break;

            int u = 0;
            int r = 0;
            int i = 0;

            for (int t = 0; t < n; t++) {
                int a = in.nextInt();
                int b = in.nextInt();
                int c = in.nextInt();

                int h = getTheHighest(a, b, c);

                if (isPowerOf2(a)) {
                    u++;

                    if (a == h) u++;
                }

                if (isPowerOf2(b)) {
                    r++;

                    if (b == h) r++;
                }

                if (isPowerOf2(c)) {
                    i++;

                    if (c == h) i++;
                }
            }

            System.out.println(getTheWinner(u, r, i));
        }

        in.close();

    }

    public static boolean isPowerOf2(int n) {
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else return false;
        }

        return true;
    }

    public static int getTheHighest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static String getTheWinner(int u, int r, int i) {
        int h = getTheHighest(u, r, i);

        if (u == h) {
            if (u == r || u == i) {
                return "URI";
            } else {
                return "Uilton";
            }
        }

        if (r == h) {
            if (r == i) {
                return "URI";
            } else {
                return "Rita";
            }
        }

        return "Ingred";
    }

}
