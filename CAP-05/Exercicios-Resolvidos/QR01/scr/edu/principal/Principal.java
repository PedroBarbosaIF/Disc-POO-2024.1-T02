//Um funcionário de uma empresa recebe, anualmente, aumento salarial. Sabe-se que:

//a) Esse funcionário foi contratado em 2005, com salário inicial de R$ 1.000,00.

//b) Em 2006, ele recebeu aumento de 1,5% sobre seu salário inicial.

//c) A partir de 2007 (inclusive), os aumentos salariais sempre corresponderam ao dobro do percentual do ano
//anterior.

//Faça um programa que determine o salário atual desse funcionário.

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
		
		float i, ano_atual, salario, novo_salario;
		float percentual;
		
		System.out.println("O valor do  ano atual");
		ano_atual = scanner.nextInt();
		
		salario = 1000;
		
		percentual = (float) (1.5/100);
		
		novo_salario = salario + percentual * salario;
		
		for (i  = 2007; i <= ano_atual; i++) {
			percentual = 2 * percentual;
			
			novo_salario = novo_salario + percentual * novo_salario;
			
			
		}
		System.out.print(" O novo salario é: " +  novo_salario  );
		

	}

}

	
	

	