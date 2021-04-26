import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int[] ref1 = {0, 9, 99, 999, 9999, 99999};
		int[] ref2 = {0, 9, 189, 2889, 38889, 488889};
				
		int p = in.nextInt();
		int l = (int) Math.log10(p);
		
		System.out.println((p - ref1[l]) * (l + 1) + ref2[l]);
		
	}

}
