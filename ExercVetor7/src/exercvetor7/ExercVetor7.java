/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercvetor7;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ExercVetor7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n, somaPares = 0, nPares =0;
        double mediaPares;
        
        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();
        
        int[] vetor = new int[n];
        
        for(int i = 0; i<n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }
        
        for(int i = 0; i<n; i++) {
            if (vetor[i] % 2 == 0) {
            somaPares = somaPares + vetor[i];
            nPares++;
            }
        }
        
         if (nPares == 0) {
	    	System.out.println("NENHUM NUMERO PAR");
	    }
	    else {
	        mediaPares = (double)somaPares / nPares;

	        System.out.printf("MEDIA DOS PARES = %.1f\n", mediaPares);
	    }
        
        sc.close();
        
    }
    
}
