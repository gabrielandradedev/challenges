import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		double pi, raio, area;
		
		pi = 3.14159;
		raio = scanner.nextDouble();
		area = pi * Math.pow(raio, 2.0);
		
		System.out.printf("A=%.4f", area);
		
		scanner.close();
		
	}
	
}
