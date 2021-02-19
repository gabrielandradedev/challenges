import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		double a, b, media;
		
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		
		a = a * 3.5 / 11;
		b = b * 7.5 / 11;

		media = a + b;
		
		System.out.printf("MEDIA = %.5f%n", media);
		
		scanner.close();
		
	}
	
}
