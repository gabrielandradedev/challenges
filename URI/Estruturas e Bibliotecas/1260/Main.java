import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		ArrayList<TreeMap<String, Integer>> trees = new ArrayList<>();
		ArrayList<Integer> counter = new ArrayList<>();

		int n = Integer.parseInt(in.nextLine());
		int i = 0;

		// Store Input
		while (in.hasNextLine()) {
			String line = in.nextLine();

			if (line.length() == 0) {
				i++;

				trees.add(new TreeMap<>());
				counter.add(0);

				if (i == n + 1) {
					break;
				} else {
					continue;
				}
			}

			TreeMap<String, Integer> set = trees.get(i - 1);

			if (set.containsKey(line)) {
				set.replace(line, set.get(line) + 1);
			} else {
				set.put(line, 1);
			}

			counter.set(i - 1, counter.get(i - 1) + 1);
		}

		in.close();

		// Process Output
		for (int j = 0; j < n; j++) {
			TreeMap<String, Integer> set = trees.get(j);
			Integer total = counter.get(j);

			set.forEach((name, ammount) -> {
				double percentage = (ammount * 100.0 / total);

				System.out.printf("%s %.4f%n", name, percentage);
			});

			if (j != n - 1) {
				System.out.println();
			}
		}

	}

}
