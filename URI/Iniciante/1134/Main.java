import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int codigo = scanner.nextInt();
		
		while (codigo != 4) {
			switch (codigo) {
			case 1:
				alcool++;
				break;
			case 2:
				gasolina++;
				break;
			case 3:
				diesel++;
				break;
			default:
				break;
			}
			
			codigo = scanner.nextInt();
		}
		
		System.out.printf("MUITO OBRIGADO%n");
		System.out.printf("Alcool: %d%n", alcool);
		System.out.printf("Gasolina: %d%n", gasolina);
		System.out.printf("Diesel: %d%n", diesel);
		
		scanner.close();
		
	}

}
