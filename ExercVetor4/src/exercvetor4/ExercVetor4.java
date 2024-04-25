/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercvetor4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ExercVetor4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int n, pares;
        
        
        System.out.print("Quantos numero voce vai digitar? ");
        n = sc.nextInt();
        
        int[] vetor = new int [n];
        
        for (int i=0; i<n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }
        
        System.out.println("NUMERO PARES: ");
        
        pares = 0;
        for(int i = 0; i<n; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.printf("%d ", vetor[i]);
                pares++;
            }
        }
        
        System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", pares);
        
        sc.close();
    }
    
}
