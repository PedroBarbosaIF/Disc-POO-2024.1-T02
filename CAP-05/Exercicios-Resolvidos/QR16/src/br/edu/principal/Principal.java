package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		/**
		 * Questão 16:
		 * Faça um programa para calcular a área de um triângulo e que não permita a entrada de dados inválidos,
		 * ou seja, medidas menores ou iguais a 0.
		 */
		
		        Scanner scanner = new Scanner(System.in);
		        
		        double base, altura;
		        
		        System.out.println("Digite as medidas do triângulo:");
		        System.out.print("Base: ");
		        base = scanner.nextDouble();
		        while (base <= 0) {
		            System.out.println("Base inválida. Digite um valor maior que 0.");
		            System.out.print("Base: ");
		            base = scanner.nextDouble();
		        }
		        
		        System.out.print("Altura: ");
		        altura = scanner.nextDouble();
		        while (altura <= 0) {
		            System.out.println("Altura inválida. Digite um valor maior que 0.");
		            System.out.print("Altura: ");
		            altura = scanner.nextDouble();
		        }
		        
		        double area = (base * altura) / 2;
		        System.out.println("A área do triângulo é: " + area);
		        
		        scanner.close();

	}

}
