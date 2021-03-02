import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m = scanner.nextInt();

		boolean[][] enemies = new boolean[n + 1][n + 1];
		byte[] present = new byte[n + 1];

		for (int i = 0; i < m; i++) {
			int u = scanner.nextInt();
			int v = scanner.nextInt();

			enemies[u][v] = true;
			enemies[v][u] = true;
		}
		
		for (int i = n; i > 0; i--) {
			if (present[i] != 2) {
				present[i] = 1;
				
				for (int j = n; j > 0; j--) {
					if (enemies[i][j]) {
						present[j] = 2;
					}
				}
			}
		}
		
		int count = 0;
		String outputS = "";
		
		for (int i = 1; i <= n; i++) {
			if (present[i] == 1) {
				count++;
				
				outputS += (" " + i);
			}
		}
		
		System.out.println(count);
		System.out.println(outputS.substring(1));

		scanner.close();

	}

}
