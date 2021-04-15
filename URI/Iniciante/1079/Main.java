import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		
		for (int i = 0; i < n; i++) {
			double a = in.nextDouble();
			double b = in.nextDouble();
			double c = in.nextDouble();
			
			double media = 0;
			
			media += a / 10 * 2;
			media += b / 10 * 3;
			media += c / 10 * 5;
			
			System.out.printf("%.1f%n", media);
		}
		
		in.close();
		
	}

}
