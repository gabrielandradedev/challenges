import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt(); in.close();
		int r = 1;
		
		for (int i = 2; i <= n; i++) {
			r *= i;
		}
		
		System.out.println(r);
		
	}

}
