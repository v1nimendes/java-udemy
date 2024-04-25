package application;


import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, nmenores;
		double altTotal, altMed, pm16;

		
		System.out.print("Quantas pessoas serao digitas? ");
		n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		
		
		for(int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
		}
		
		nmenores = 0;
		altTotal = 0;
		
		for (int i=0; i<n; i++) {
			if (idades[i] < 16) {
				nmenores++;
			}
			altTotal = altTotal + alturas[i];
		}
		
		altMed = altTotal / n;
		
		pm16 = ((double)nmenores / n ) * 100.0;
		
		 System.out.printf("\nAltura media = %.2f\n", altMed);
		    System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", pm16);

		    for(int i=0; i<n; i++) {
		        if (idades[i] < 16) {
		        	System.out.printf("%s\n", nomes[i]);
		        }
		    }
		
		
		
		sc.close();

	}

}
