import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(input);
		StringTokenizer in;

		in = new StringTokenizer(reader.readLine());
		
		int n = Integer.parseInt(in.nextToken());
		int m = Integer.parseInt(in.nextToken());
		int h = n + 1;
		
		boolean[] nope = new boolean[h];
		TreeSet<Tuple> enemies = new TreeSet<Tuple>();
		
		for (int i = 0; i < m; i++) {
			in = new StringTokenizer(reader.readLine());
			
			int u = Integer.parseInt(in.nextToken());
			int v = Integer.parseInt(in.nextToken());
			
			enemies.add(new Tuple(u, v));
		}
		
		for (Tuple t : enemies) {
			if (!nope[t.x]) {
				nope[t.y] = true;
			}
		}
		
		int count = 0;
		String output = "";
		
		for (int i = 1; i < h; i++) {
			if (!nope[i]) {
				count++;
				output += " " + i;
			}
		}
		
		System.out.println(count);
		System.out.println(output.substring(1));

	}

}

class Tuple implements Comparable<Tuple> { 
	int x;
	int y;
	
	Tuple(int a, int b) {
		int best, worst;
		
		if (a > b) {
			best = a;
			worst = b;
		} else {
			best = b;
			worst = a;
		}
		
		this.x = best;
		this.y = worst;
	}

	@Override
	public int compareTo(Tuple o) {
		return this.x > o.x ? -1 : 1;
	}
} 
