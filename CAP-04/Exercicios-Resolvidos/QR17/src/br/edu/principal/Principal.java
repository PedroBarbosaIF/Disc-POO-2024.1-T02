package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		/**
		 *  Questão 17
		Faça um programa para resolver equações do 2o grau:
		 * ax^2 + bx + c = 0
		 * A variável a deve ser diferente de zero.
		 * ∆ = b^2 - 4 * a * c
		 * ∆ < 0 → não existe raiz real
		 * ∆ = 0 → existe uma raiz real
		 * x = (-b) / (2 * a)
		 * ∆ > 0 → existem duas raízes reais
		 * x1 = (-b + ∆) / (2 * a)
		 * x2 = (-b - ∆) / (2 * a)
		 */
		
		        Scanner scanner = new Scanner(System.in);
		        
		        double a, b, c;
		        
		        System.out.println("Digite os coeficientes da equação ax^2 + bx + c = 0:");
		        System.out.print("a: ");
		        a = scanner.nextDouble();
		        
		        if (a == 0) {
		            System.out.println("Coeficiente 'a' deve ser diferente de zero.");
		            return;
		        }
		        
		        System.out.print("b: ");
		        b = scanner.nextDouble();
		        System.out.print("c: ");
		        c = scanner.nextDouble();
		        
		        double delta = Math.pow(b, 2) - 4 * a * c;
		        
		        if (delta < 0) {
		            System.out.println("Não existem raízes reais.");
		        } else if (delta == 0) {
		            double x = -b / (2 * a);
		            System.out.println("Existe uma raiz real: x = " + x);
		        } else {
		            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		            System.out.println("Existem duas raízes reais:");
		            System.out.println("x1 = " + x1);
		            System.out.println("x2 = " + x2);
		        }
		        
		        scanner.close();

	}

}
