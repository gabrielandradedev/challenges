import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		UpaCollection upas = new UpaCollection(n);
		
		for (int i = 0; i < m; i++) {
			int u = scanner.nextInt();
			int v = scanner.nextInt();
			
			upas.addEnemy(u, v);
			upas.addEnemy(v, u);
		}
		
		ArrayList<Integer> outputCollection = upas.getOutputColection();
		String outputString = upas.getOutputString(outputCollection);

		System.out.println(outputCollection.size());
		System.out.println(outputString);
		
		scanner.close();
	}

}

class UpaCollection {
	
	Upa[] upas;
	boolean[] canUse;
	
	UpaCollection(int n) {
		upas = new Upa[n];
		canUse = new boolean[n];
		
		for (int i = 0; i < n; i++) {
			upas[i] = new Upa();
			canUse[i] = true;
		}
	}
	
	void addEnemy(int id, int enemyId) {
		upas[id - 1].addEnemy(enemyId - 1);
	}
	
	ArrayList<Integer> getOutputColection() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int len = canUse.length - 1;
		
		for (int i = len; i >= 0; i--) {
			if (canUse[i]) {
				Upa upaI = upas[i];
				
				for (int enemy : upaI.enemies) {
					canUse[enemy] = false;
				}
				
				list.add(i + 1);
			}
		}
		
		return list;
	}
	
	String getOutputString(ArrayList<Integer> outputCollection) {
		String outputString = "";
		
		for (int e : outputCollection) {
			outputString = " " + e + outputString;
		}
		
		return outputString.substring(1);
	}
	
}

class Upa {
	
	ArrayList<Integer> enemies;
	
	Upa() {
		enemies = new ArrayList<Integer>();
	}
	
	void addEnemy(int enemyId) {
		enemies.add(enemyId);
	}
	
}
