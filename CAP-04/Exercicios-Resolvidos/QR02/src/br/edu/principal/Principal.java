//02.Faça um programa que receba três notas de um aluno, calcule e mostre a média aritmética e a mensagem constante na tabela a seguir. Aos alunos que ficaram para exame, calcule e mostre a nota que deverão tirar para serem aprovados, considerando que a média exigida é 6,0.

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {  
Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a nota 1");
		float nota1 = scanner.nextFloat();
		
		System.out.println("Digite a nota 2");
		float nota2 = scanner.nextFloat();
		

		System.out.println("Digite a nota 3");
		float nota3 = scanner.nextFloat();
		
		float notaTotal = (nota1 + nota2 + nota3)/3;
		
		System.out.println("A media é " + notaTotal);
		
		if (notaTotal >=7 && notaTotal <=10) {
			System.out.println("Aprovado");
			
			
		}
		if (notaTotal <7 && notaTotal >=3 ) {
			System.out.println("Exame");
			float novaNota = (notaTotal - 6) * -1;
			System.out.println("Falta " + novaNota + " para chegar em 6");
			
		
	
			
		}	
        
		if(notaTotal >=0 && notaTotal <3) {
			System.out.println("Reprovado");
		}
		
	}
}