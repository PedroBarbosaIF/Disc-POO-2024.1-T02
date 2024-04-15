/*11. Faça um programa que receba um número inteiro maior que 1, verifique se o número fornecido é pri-
mo ou não e mostre uma mensagem de número primo ou de número não primo.

Um número é primo quando é divisível apenas por 1 e por ele mesmo.*/

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int i, num, resto, qtde;
		
		System.out.println("Digite um número inteiro maior que 1: ");
		num = sc.nextInt();
		qtde = 0;
		
		for (i=1; i<=num; i++)
		{
			if (num%i==0)
			qtde=qtde+1;
		}
		
		if (qtde>2)
		{
			System.out.println("Número não primo");
		}
		else
			System.out.println("Número primo");
		
	}

}
