package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double cDolar = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		double vDolar = sc.nextDouble();
		
		double total = CurrencyConverter.converterDolarParaReal(cDolar, vDolar);
		
		System.out.print("Amount to be paid in reais = " + total);
		
		
		sc.close();
	}

}
