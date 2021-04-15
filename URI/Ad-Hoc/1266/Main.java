import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static int prev = 0;
    public static int next = 0;

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        while (true) {
            int n = in.nextInt();

            if (n == 0) {
                break;
            }

            // Get Input
            boolean[] fences = new boolean[n];
            boolean hasOnes = false;

            for (int i = 0; i < n; i++) {
                int x = in.nextInt();

                if (x == 1) {
                    fences[i] = true;
                    hasOnes = true;
                } else {
                    fences[i] = false;
                }
            }

            // Process Wood Posts
            int wood = 0;

            // Iteration Marks
            int i = 0;
            int end = fences.length - 1;

            if (hasOnes) {
                while (true) {
                    setPrevNext(i, end);

                    if (fences[next]) {
                        end = i;
                        i = next;

                        break;
                    } else {
                        i = next;
                    }
                }
            }

            while (i != end) {
                setPrevNext(i, fences.length - 1);

                if (!fences[i]) {
                    if (!fences[prev] && !fences[next]) {
                        fences[i] = true;
                        wood++;
                    } else if (fences[prev] && !fences[next]) {
                        fences[next] = true;
                        wood++;
                    } else if (!fences[prev] && fences[next]) {
                        fences[prev] = true;
                        wood++;
                    }
                }

                i = next;
            }

            System.out.println(wood);
        }

        in.close();

    }

    public static void setPrevNext(int i, int max) {
        if (i == 0) {
            prev = max;
            next = i + 1;
        } else if (i == max) {
            prev = i - 1;
            next = 0;
        } else {
            prev = i - 1;
            next = i + 1;
        }
    }

}
