import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		double a, b, c, media;
		
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		
		a = a * 2 / 10;
		b = b * 3 / 10;
		c = c * 5 / 10;
		
		media = a + b + c;
		
		System.out.printf("MEDIA = %.1f%n", media);
		
		scanner.close();
		
	}
	
}
