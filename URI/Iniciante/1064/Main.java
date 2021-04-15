import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		int i = 1;
		int x = in.nextInt();

		in.close();

		while (i <= x) {
			System.out.println(i);
			i += 2;
		}

	}

}
