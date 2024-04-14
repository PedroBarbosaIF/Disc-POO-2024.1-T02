package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		/**
		 * Questão 18:
		Dados três valores X, Y e Z, verifique se eles podem ser os comprimentos dos lados de um triângulo
		 * e, se forem, verifique se é um triângulo equilátero, isósceles ou escaleno. Se eles não formarem um 
		 * triângulo, escreva uma mensagem.
		 * Considere que:
		 * - O comprimento de cada lado de um triângulo é menor que a soma dos outros dois lados; 
		 * - Chama-se equilátero o triângulo que tem três lados iguais; 
		 * - Denomina-se isósceles o triângulo que tem o comprimento de dois lados iguais; 
		 * - Recebe o nome de escaleno o triângulo que tem os três lados diferentes.
		 */
	
		        Scanner scanner = new Scanner(System.in);
		        
		        double x, y, z;
		        
		        System.out.println("Digite os comprimentos dos lados do triângulo:");
		        System.out.print("X: ");
		        x = scanner.nextDouble();
		        System.out.print("Y: ");
		        y = scanner.nextDouble();
		        System.out.print("Z: ");
		        z = scanner.nextDouble();
		        
		        if (x < y + z && y < x + z && z < x + y) {
		            if (x == y && y == z) {
		                System.out.println("É um triângulo equilátero.");
		            } else if (x == y || x == z || y == z) {
		                System.out.println("É um triângulo isósceles.");
		            } else {
		                System.out.println("É um triângulo escaleno.");
		            }
		        } else {
		            System.out.println("Os valores não formam um triângulo.");
		        }
		        
		        scanner.close();

	}

}
