import java.util.Scanner;

public class Main {
	
	public static int x = 4;
	public static int y = 3;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int i = 0;
		
		for (; i < n; i++) {
			if (!move(in.nextInt())) {
				i++;
				break;
			}
		}
		
		System.out.println(i);
		
	}
	
	public static boolean move(int type) {
		// Move based on move type
		switch (type) {
		case 1:
			x += 1;
			y += 2;
			break;
		case 2:
			x += 2;
			y += 1;
			break;
		case 3:
			x += 2;
			y -= 1;
			break;
		case 4:
			x += 1;
			y -= 2;
			break;
		case 5:
			x -= 1;
			y -= 2;
			break;
		case 6:
			x -= 2;
			y -= 1;
			break;
		case 7:
			x -= 2;
			y += 1;
			break;
		case 8:
			x -= 1;
			y += 2;
		}
		
		// Check if it is a hole
		if (x == 1 && y == 3) {
			return false;
		}
		if (x == 2 && y == 3) {
			return false;
		}
		if (x == 2 && y == 5) {
			return false;
		}
		if (x == 5 && y == 4) {
			return false;
		}
		
		return true;
	}

}
