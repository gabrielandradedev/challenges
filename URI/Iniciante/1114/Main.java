import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		int senha = scanner.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Invalida");
			
			senha = scanner.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		scanner.close();
		
	}

}
