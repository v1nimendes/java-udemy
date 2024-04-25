/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercvetor8;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ExercVetor8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       
       int n, maioridade, posicaomaior;
       
        System.out.print("Quantas pessoa voce vai digitar: ");
        n = sc.nextInt();
        
        String[] nomes = new String[n];
        int[] idades = new int[n];
        
        for (int i =0; i<n; i++) {
            System.out.printf("Dados da %da pessoa: ", i + 1);
            System.out.print("\nNome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }
        
        maioridade = idades[0];
        posicaomaior = 0;
        
        for(int i=1; i<n; i++) {
           if (idades[i] > maioridade) {
               maioridade = idades[i];
               maioridade = i;
           }
        }
        
        System.out.printf("PESSOA MAIS VELHA: %s\n", nomes[posicaomaior]);
       
       sc.close();
    }
    
}
