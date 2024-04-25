package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Informe o nome do aluno: ");
		student.nome = sc.next();
		System.out.println("Informe a primeira nota: ");
		student.n1 = sc.nextDouble();
		System.out.println("Informe a primeira nota: ");
		student.n2 = sc.nextDouble();
		System.out.println("Informe a primeira nota: ");
		student.n3 = sc.nextDouble();
		
		
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
		
		if (student.finalGrade() <60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		}
		else {
			System.out.println("PASS");
		}
		sc.close();
		
		

	}

}
