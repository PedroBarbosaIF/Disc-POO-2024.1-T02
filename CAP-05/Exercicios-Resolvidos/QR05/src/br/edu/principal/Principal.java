//Faça um programa que leia o número de termos e um valor positivo para X. Calcule e mostre o valor
//da série a seguir:
//S = -X2 +X3 –X4 +X5 -X6 +X7 -X8 +X9 -X10 +X11 -...
//     1!  2!  3!  4!  3!  2!  1!  2!  3!  4!
 
package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        int num_termos;
	        double x, s = 0;
	        int denominador = 1;

	        System.out.print("Digite o número de termos: ");
	        num_termos = scanner.nextInt();
	        System.out.print("Digite um valor positivo para X: ");
	        x = scanner.nextDouble();

	        for (int i = 1; i <= num_termos; i++) {
	            int fim = denominador;
	            int fat = 1;

	            for (int j = 1; j <= fim; j++) {
	                fat *= j;
	            }

	            int expoente = i + 1;
	            double termo = Math.pow(x, expoente) / fat;

	            if (expoente % 2 == 0) {
	                s -= termo;
	            } else {
	                s += termo;
	            }

	            if (denominador == 4) {
	                denominador = -1;
	            }

	            if (denominador == 1) {
	                denominador = 1;
	            }

	            denominador = denominador == 1 ? denominador + 1 : denominador - 1;
	        }

	        System.out.println("O valor da série é: " + s);

	        scanner.close();

	        

	}

}
