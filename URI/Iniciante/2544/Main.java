import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
	
		while (scanner.hasNext()) {
			int copias = scanner.nextInt();
			int vezes = 0;
			
			while (copias != 1) {
				copias = copias / 2;
				
				vezes++;
			}
			
			System.out.println(vezes);
		}
		
		scanner.close();
	}
	
}
