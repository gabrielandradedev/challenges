import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int m = in.nextInt();

		boolean[] nope = new boolean[n + 1];
		ArrayList<Tuple> enemies = new ArrayList<Tuple>(m);

		for (int i = 0; i < m; i++) {
			int u = in.nextInt();
			int v = in.nextInt();

			enemies.add(new Tuple(u, v));
		}

		in.close();

		Collections.sort(enemies);

		for (Tuple t : enemies) {
			if (!nope[t.x]) {
				nope[t.y] = true;
			}
		}

		// Output
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (!nope[i]) {
				count++;
			}
		}

		System.out.println(count);

		for (int i = 1; i < n; i++) {
			if (!nope[i]) {
				System.out.print(i + " ");
			}
		}

		System.out.println(n);
	}

}

class Tuple implements Comparable<Tuple> {
	int x;
	int y;

	Tuple(int a, int b) {
		if (a > b) {
			this.x = a;
			this.y = b;
		} else {
			this.x = b;
			this.y = a;
		}
	}

	@Override
	public int compareTo(Tuple o) {
		return (o.x + o.y) - (this.x + this.y);
	}
}
