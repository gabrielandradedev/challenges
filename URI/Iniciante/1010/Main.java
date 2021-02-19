import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		int p1qtd, p2qtd;
		double p1pre, p2pre, total;
		
		scanner.nextInt(); // p1cod
		p1qtd = scanner.nextInt();
		p1pre = scanner.nextDouble();
		scanner.nextInt(); // p2cod
		p2qtd = scanner.nextInt();
		p2pre = scanner.nextDouble();
		
		total = (p1qtd * p1pre) + (p2qtd * p2pre);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		scanner.close();
		
	}
	
}
