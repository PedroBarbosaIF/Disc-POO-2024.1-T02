package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		/**
		 * Questão 19:
		 * Faça um programa que leia um número não determinado de pares de valores [m,n], todos inteiros e
		 * positivos, um par de cada vez, e que calcule e mostre a soma de todos os números inteiros entre m e n 
		 * (inclusive). A digitação de pares terminará quando m for maior ou igual a n.
		 */
		


		        Scanner scanner = new Scanner(System.in);
		        
		        int m, n;
		        int soma;
		        
		        do {
		            System.out.print("Digite o valor de m: ");
		            m = scanner.nextInt();
		            System.out.print("Digite o valor de n: ");
		            n = scanner.nextInt();
		            
		            soma = 0;
		            if (m < n) {
		                for (int i = m; i <= n; i++) {
		                    soma += i;
		                }
		                System.out.println("A soma dos números inteiros entre " + m + " e " + n + " é: " + soma);
		            } else {
		                System.out.println("Valor de m maior ou igual a n. Encerrando programa.");
		            }
		            System.out.println("--------------------------");
		        } while (m < n);
		        
		        scanner.close();

	}

}
