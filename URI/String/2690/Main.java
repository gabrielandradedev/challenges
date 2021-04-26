import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int n = Integer.parseInt(in.nextLine());
		
		for (int i = 0; i < n; i++) {
			String line = in.nextLine()
					.replace(" ", "")
					.substring(0, 12);
			
			line = line.replaceAll("[GQaku]", "0");
			line = line.replaceAll("[ISblv]", "1");
			line = line.replaceAll("[EOYcmw]", "2");
			line = line.replaceAll("[FPZdnx]", "3");
			line = line.replaceAll("[JTeoy]", "4");
			line = line.replaceAll("[DNXfpz]", "5");
			line = line.replaceAll("[AKUgq]", "6");
			line = line.replaceAll("[CMWhr]", "7");
			line = line.replaceAll("[BLVis]", "8");
			line = line.replaceAll("[HRjt]", "9");
			
			System.out.println(line);
		}
		
		in.close();
		
	}

}
