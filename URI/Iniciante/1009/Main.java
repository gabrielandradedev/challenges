import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		double salario, vendas, comissao, total;
		
		scanner.next(); // nome
		salario = scanner.nextDouble();
		vendas = scanner.nextDouble();
		
		comissao = vendas * 0.15;
		total = salario + comissao;
		
		System.out.printf("TOTAL = R$ %.2f%n", total);
		
		scanner.close();
		
	}
	
}
