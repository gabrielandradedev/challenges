import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m = scanner.nextInt();

		HashMap<Integer, ArrayList<Integer>> enemies = new HashMap<Integer, ArrayList<Integer>>();

		byte[] present = new byte[n + 1];

		for (int i = 0; i < m; i++) {
			int u = scanner.nextInt();
			int v = scanner.nextInt();

			if (!enemies.containsKey(u)) {
				enemies.put(u, new ArrayList<Integer>());
			}
			
			if (!enemies.containsKey(v)) {
				enemies.put(v, new ArrayList<Integer>());
			}

			enemies.get(u).add(v);
			enemies.get(v).add(u);
		}

		for (int i = n; i > 0; i--) {
			if (present[i] != 2) {
				present[i] = 1;

				ArrayList<Integer> thisEnemies = enemies.get(i);
				
				if (thisEnemies != null) {
					for (int enemy : thisEnemies) {
						present[enemy] = 2;
					}
				}
			}
		}
		
		
		int count = 0;
		String output = "";
		
		for (int i = 0; i <= n; i++) {
			if (present[i] == 1) {
				count++;
				output += " " + i;
			}
		}
		
		System.out.println(count);
		System.out.println(output.substring(1));

		scanner.close();

	}

}
