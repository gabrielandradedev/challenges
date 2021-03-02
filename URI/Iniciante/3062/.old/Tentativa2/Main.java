import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m = scanner.nextInt();

		boolean[][] enemies = new boolean[n + 1][n + 1];

		for (int i = 0; i < m; i++) {
			int u = scanner.nextInt();
			int v = scanner.nextInt();

			enemies[u][v] = true;
			enemies[v][u] = true;
		}
		
		TreeMap<Integer, TreeSet<Integer>> combinations = new TreeMap<Integer, TreeSet<Integer>>();
		
		for (int i = n; i > 0; i--) {
			double value = Math.pow(2, i);
			TreeSet<Integer> combination = new TreeSet<Integer>();
			
			combination.add(i);
			
			for (int j = n; j > 0; j--) {
				if (i != j && !enemies[i][j]) {
					value += Math.pow(2, j);
					combination.add(j);
					
					for (int k = n; k > 0; k--) {
						if (enemies[j][k]) {
							enemies[i][k] = true;
						}
					}
				}
			}
			
			combinations.put((int) value, combination);
		}
		
		TreeSet<Integer> winner = combinations.lastEntry().getValue();
		String winnerS = "";
		
		for (int w : winner) {
			winnerS += " " + w;
		}
		
		winnerS = winnerS.substring(1);
		
		System.out.println(winner.size());
		System.out.println(winnerS);

		scanner.close();

	}

}
