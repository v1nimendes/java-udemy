package application;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double media;
		
		System.out.print("Quantos alunos serao digitados? ");
		n = sc.nextInt();
		
		String[] nome = new String[n];
		Double[] nota1 = new Double[n];
		Double[] nota2 = new Double[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Digite nome, primeira nota do %do aluno: \n", i + 1);
			nome[i] = sc.next();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados: ");
		
		for(int i=0; i<n; i++) {
			media = (nota1[i] + nota2[i]) / 2;
			if(media >=6.0) {
				System.out.printf("%s\n", nome[i]);
			}
		}
		
		sc.close();

	}

}
