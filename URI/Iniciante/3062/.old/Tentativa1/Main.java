import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		HashMap<Integer, List<Integer>> enemies = new HashMap<Integer, List<Integer>>();
		
		// List Enemies
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
		
		// Find Combinations
		TreeMap<Integer, Set<Integer>> combinations = new TreeMap<Integer, Set<Integer>>();
		
		for (int i = n; i > 0; i--) {
			Set<Integer> combination = new HashSet<Integer>();
			List<Integer> cantInsert = new ArrayList<Integer>();
			int points = (int) Math.pow(2, i);
			
			combination.add(i);
			cantInsert.add(i);
			
			List<Integer> enemyI = enemies.get(i);
			
			if (enemyI != null) {
				enemyI.forEach(e -> {
					cantInsert.add(e);
				});
			}
			
			for (int j = n; j > 0; j--) {
				if (!cantInsert.contains(j)) {
					points += (int) Math.pow(2, j);
					
					combination.add(j);
					cantInsert.add(j);
					
					List<Integer> enemyJ = enemies.get(j);
					
					if (enemyJ != null) {
						enemyJ.forEach(e -> {
							cantInsert.add(e);
						});
					}
				}
			}
			
			combinations.put(points, combination);
		}
		
		// Get Winner and produce output
		Set<Integer> winner = combinations.lastEntry().getValue();
		String winnerSpec = "";
		
		for (Integer w : winner) {
			winnerSpec += (" " + w);
		}
		
		winnerSpec = winnerSpec.substring(1);
		
		System.out.println(winner.size());
		System.out.println(winnerSpec);
		
		scanner.close();
	
	}
	
}
