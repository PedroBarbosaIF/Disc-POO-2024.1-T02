/*8. Faça um programa que mostre o menu de opções a seguir, receba a opção do usuário e os dados neces-
sários para executar cada operação.*/

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, soma, op;
		double raiz;
		
		System.out.println("ESCOLHA UMA OPÇÃO DO MENU:");
		System.out.println("1- Somar dois números");
		System.out.println("2- Raiz quadrada de um número");
		System.out.println("Digite sua opção: ");
		op = sc.nextInt ();
		
		if (op == 1) {
			System.out.println("Digite um valor para o primeiro número: ");
			num1 = sc.nextInt ();
			System.out.println("Digite um valor para o segundo número: ");
			num2 = sc.nextInt ();
			soma = num1 + num2;
			System.out.println("A soma de " + num1 + " e " + num2 + " é " + soma);
			
		} else if (op == 2) {
			System.out.println("Digite um valor: ");
			num1 = sc.nextInt ();
			raiz = Math.sqrt(num1);
			System.out.println("A raiz quadrada de " + num1 + " é " + raiz);
		} else {
			System.out.println("Opção inválida!");
		}
	}

}
