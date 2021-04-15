import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int n = in.nextInt();
            int g = in.nextInt();

            int[] results = new int[n];
            int points = 0;

            // Get Input
            for (int i = 0; i < n; i++) {
                byte s = in.nextByte();
                byte r = in.nextByte();

                results[i] = s - r;
            }

            Arrays.sort(results);

            // Process Points
            for (int i = n - 1; i > -1; i--) {
                if (results[i] > 0) { // Victory
                    points += 3;
                } else if (results[i] == 0) { // Draw
                    if (g > 0) {
                        g--;
                        points += 3;
                    } else {
                        points += 1;
                    }
                } else { // Loose
                    int result = g + results[i];

                    if (g > 0) {
                        if (result == 0) {
                            points += 1;
                            break;
                        } else if (result > 0) {
                            points += 3;
                            g += results[i] - 1;
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }

            // Output
            System.out.println(points);
        }

        in.close();

    }

}
