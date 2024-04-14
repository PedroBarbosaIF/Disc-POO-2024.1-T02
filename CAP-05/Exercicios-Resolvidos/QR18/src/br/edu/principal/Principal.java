package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		 /**
	 * Questão 18:
	 * Faça um programa que leia um conjunto não determinado de valores e mostre o valor lido, seu quadrado,
	 * seu cubo e sua raiz quadrada. Finalize a entrada de dados com um valor negativo ou zero.
	 */
	
	        Scanner scanner = new Scanner(System.in);
	        
	        double valor;
	        
	        System.out.println("Digite os valores (encerre com um valor negativo ou zero):");
	        while (true) {
	            System.out.print("Valor: ");
	            valor = scanner.nextDouble();
	            
	            if (valor <= 0) {
	                break;
	            }
	            
	            double quadrado = valor * valor;
	            double cubo = valor * valor * valor;
	            double raizQuadrada = Math.sqrt(valor);
	            
	            System.out.println("Valor: " + valor);
	            System.out.println("Quadrado: " + quadrado);
	            System.out.println("Cubo: " + cubo);
	            System.out.println("Raiz Quadrada: " + raizQuadrada);
	            System.out.println("--------------------------");
	        }
	        
	        scanner.close();
	}

}
