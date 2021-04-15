import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			
			if (y == 0) {
				System.out.println("divisao impossivel");
			} else {
				System.out.printf("%.1f%n", (float) x / y);
			}
		}
		
		in.close();
		
	}

}
