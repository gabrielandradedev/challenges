import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String[] mk = in.nextLine().split(" ");
            String[] mi = in.nextLine().split(" ");
            String[] ki = in.nextLine().split(" ");

            int m = Integer.parseInt(mk[0]);
            int k = Integer.parseInt(mk[1]);

            int[] musicList = Arrays
                    .stream(mi)
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int[] playlist = Arrays
                    .stream(ki)
                    .mapToInt(Integer::parseInt)
                    .toArray();

            Set<Integer> leftToPlay = IntStream
                    .rangeClosed(1, m)
                    .boxed()
                    .collect(Collectors.toSet());

            int time = 0;

            for (int i = 0; i < k; i++) {
                if (leftToPlay.size() == 0) break;

                int p = playlist[i] - 1;

                time += musicList[p];
                leftToPlay.remove(playlist[i]);
            }

            if (leftToPlay.size() != 0) time = -1;

            System.out.println(time);
        }

        in.close();

    }

}
