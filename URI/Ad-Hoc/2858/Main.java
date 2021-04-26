import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		// Input
		Scanner in = new Scanner(System.in);
		
		int d = in.nextInt();
		int e = in.nextInt();
		
		in.close();
		
		if (e == 1 || d == 1) {
			System.out.println(1);
			return;
		}
		
		// Inverse left and right to better working with the numbers later
		if (e > d) {
			int temp = d;
			d = e;
			e = temp;
		}
		
		if (!possible(e, d)) {
			System.out.println("IMPOSSIVEL");
			return;
		}
		
		// Process
		int level = 1;
		int total = d;
		
		while (true) {
			level++;
			
			if (total > 0) {
				total -= e;
			} else {
				total += d;
			}
			
			if (Math.abs(total) == 1) break;
		}
		
		System.out.println(level);
		
	}
	
	public static boolean possible(int min, int max) {
		int a = min;
		int b = max;
		
		while (true) {
			int rest = b % a;
			
			if (rest == 0) {
				return false;
			}
			if (rest == 1) {
				return true;
			}
			
			b = a;
			a = rest;
		}
	}

}
