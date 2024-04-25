/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercvetor5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ExercVetor5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = 0;
        
        System.out.print("Quanros valores vai ter cada vetor? ");
        n = sc.nextInt();
        
        int[] A = new int[n];
        
        
        System.out.println("Digite os valores do vetor A: ");
        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }
        
        int[] B = new int[n];
        
        System.out.println("Digite os valores do vetor B: ");
        for(int i=0; i<n; i++) {
            B[i] = sc.nextInt();
        }
       
        int[] C = new int[n];
        
        for (int i=0; i<n; i++) {
            C[i] = A[i] + B[i]; 
        }
        
        System.out.println("VETOR RESULTANTE:");
        
        for(int i=0; i<n; i++) {
            System.out.println(C[i]);
        }
        
       sc.close();
    }
    
}
