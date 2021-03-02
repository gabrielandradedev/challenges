import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	
	public static int cidadeId = 1;
	
	public static void main(String[] args) throws IOException {
		
		Locale.setDefault(Locale.US);
		
		DecimalFormat df = new DecimalFormat("0.000");
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			int qtdImoveis = scanner.nextInt();
			
			if (qtdImoveis == 0) break;
			
			if (cidadeId > 1) {
				System.out.println();
			}
			
			// Get Input
			TreeMap<Integer, Integer> consumoTotal = new TreeMap<>();
			int totalPessoas = 0;
			float totalConsumo = 0.00f;
			
			for (int i = 0; i < qtdImoveis; i++) {
				byte x = scanner.nextByte();
				short y = scanner.nextShort();
				
				int consumo = y / x;
				
				totalPessoas += x;
				totalConsumo += y;
				
				if (!consumoTotal.containsKey(consumo)) {
					consumoTotal.put(consumo, (int) x);
				} else {
					consumoTotal.replace(consumo, (consumoTotal.get(consumo) + x));
				}
			}
			
			// Create Output - Consumo
			String outputConsumo = "";
			
			for (Entry<Integer, Integer> entry : consumoTotal.entrySet()) {
				outputConsumo += " " + entry.getValue() + "-" + entry.getKey();
			}
			
			outputConsumo = outputConsumo.substring(1);
			
			// Create Output - Consumo Médio
			String consumoMedio = df.format((totalConsumo / totalPessoas));
			consumoMedio = consumoMedio.substring(0, consumoMedio.length() - 1);
			
			// Format
			
			// Output
			System.out.printf("Cidade# %d:%n", cidadeId);
			System.out.println(outputConsumo);
			System.out.printf("Consumo medio: %s m3.%n", consumoMedio);
			
			cidadeId++;
		}
		
		scanner.close();
	}
	
}
