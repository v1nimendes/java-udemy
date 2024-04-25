package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//ABRE O ARQUIVO
		File file = new File("C:\\Windows\\Temp\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("Error opening file: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("Finally block executed\n");
		}
		
		
		//MOSTRA MENSAGEM DE ERRO
		File file2 = new File("C:\\Temp\\in.txt");
		Scanner sc2 = null;
		try {
			sc = new Scanner(file2);
			while (sc.hasNextLine()) {
				System.out.println(sc2.nextLine());
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("Error opening file: " + e.getMessage());
		}
		finally {
			if (sc2 != null) {
				sc2.close();
			}
			System.out.println("Finally block executed");
		}
		

		
		
	}
}
