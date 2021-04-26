import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String[] size = in.nextLine().split(" ");
		int rows = Integer.parseInt(size[0]);
		int cols = Integer.parseInt(size[1]);
		
		int clicks = 0;
		
		// Create Board
		Board.map = new boolean[rows][cols];
		
		for (int i = 0; i < rows; i++) {
			char[] line = in.nextLine().toCharArray();
			
			for (int j = 0; j < cols; j++) {
				if (line[j] == 'o') {
					Board.map[i][j] = true;
				}
			}
		}
		
		in.close();
		
		// Count Click
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (!Board.map[i][j]) {
					clicks++;
					Board.traverse(i, j);
				}
			}
		}
		
		System.out.println(clicks);

	}

}

class Board {
	public static boolean[][] map;
	public static List<Coordinate> queue;
	
	public static void traverse(int i, int j) {
		queue = new ArrayList<>();
		queue.add(new Coordinate(i, j));
		
		for (int k = 0; k < queue.size(); k++) {
			Coordinate coordinate = queue.get(k);
			
			Board.click(coordinate.i, coordinate.j);
		}
	}
	
	public static void click(int i, int j) {
		if (checkBounds(i, j)) return;
		if (Board.map[i][j]) return;
		
		Board.map[i][j] = true;
		
		queue.add(new Coordinate(i - 1, j));
		queue.add(new Coordinate(i + 1, j));
		queue.add(new Coordinate(i, j - 1));
		queue.add(new Coordinate(i, j + 1));
	}
	
	public static boolean checkBounds(int i, int j) {
		return i < 0 || j < 0 || i >= Board.map.length || j >= Board.map[i].length;
	}
}

class Coordinate {
	public int i;
	public int j;
	
	public Coordinate(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	@Override
	public String toString() {
		return "[" + this.i + "," + this.j + "]";
	}
}
