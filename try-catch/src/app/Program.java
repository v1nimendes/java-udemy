package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		method1();
		/*Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
		}
		catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		
		System.out.println("End of program");
		
		sc.close();*/
		
		System.out.println("End of program");
		
		
	}
	public static void method1() {
		System.out.println("***COMEÇO***");
		method2();
		System.out.println("***FIM***");
	}

	private static void method2() {
		
		//STACK TRACE
		
		System.out.println("***COMEÇO***");
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();
			sc.next();
		}
		catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		
		sc.close();
		System.out.println("***FIM***");
	}

}
