import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		int a, b, c, d, diferenca;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		d = scanner.nextInt();		
		
		diferenca = a * b - c * d;
		
		System.out.printf("DIFERENCA = %d%n", diferenca);
		
		scanner.close();
		
	}
	
}
