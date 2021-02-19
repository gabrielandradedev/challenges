import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		double pi, raio, volume;
		
		pi = 3.14159;
		raio = scanner.nextDouble();
		volume = (4.0 / 3.0) * pi * Math.pow(raio, 3.0);
		
		System.out.printf("VOLUME = %.3f%n", volume);
		
		scanner.close();
		
	}
	
}
