import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(input);
		StringTokenizer in = new StringTokenizer(reader.readLine());
		
		String output = "";
		
		while (in.hasMoreElements()) {
			String word = in.nextToken();
			
			if (word.length() > 3) {
				if (word.charAt(0) == word.charAt(2) && word.charAt(1) == word.charAt(3)) {
					word = word.substring(2);
				}
			}
			
			output += word + " ";
		}
		
		output = output.substring(0, output.length() - 1);
		
		System.out.println(output);

	}

}
