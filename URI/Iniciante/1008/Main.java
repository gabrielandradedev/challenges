import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		int number, hours;
		double remuneration, salary;
		
		number = scanner.nextInt();
		hours = scanner.nextInt();
		remuneration = scanner.nextDouble();
		
		salary = hours * remuneration;
		
		System.out.printf("NUMBER = %d%n", number);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		
		scanner.close();
		
	}
	
}
