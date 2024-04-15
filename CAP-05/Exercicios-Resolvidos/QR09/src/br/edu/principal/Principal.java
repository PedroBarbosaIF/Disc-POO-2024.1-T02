package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Questão resolvida QR09: Faça um programa que receba duas notas de seis alunos. Calcule e mostre:
		
		- a média aritmética das duas notas de cada aluno; e
		- a mensagem que está na tabela a seguir:
		- o total de alunos aprovados;
		- o total de alunos de exame;
		- o total de alunos reprovados;
		- a média da classe.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		float nota1, nota2, média_notas, média_médias = 0;
		byte reprovados = 0, aprovados = 0, em_exame = 0;
		
		for(int i = 1;i<=6; i++) 
		{
			System.out.println("Digite a primeira nota do "+ i +"° aluno: ");
			nota1 = sc.nextFloat();
			
			System.out.println("Digite a segunda nota do "+ i +"° aluno: ");
			nota2 = sc.nextFloat();
			
			média_notas = (nota1 + nota2)/2;
			média_médias = média_médias + média_notas;
			
			if (média_notas <= 3) 
			{
				System.out.println("O "+ i + "° aluno está REPROVADO!");
				System.out.println("");
				reprovados++;
			}
			else if (média_notas > 3 & média_notas < 7) 
			{
				System.out.println("O "+ i + "° aluno está EM EXAME!");
				System.out.println("");
				em_exame++;
			}
			else 
			{
				System.out.println("O "+ i + "° aluno está APROVADO!");
				System.out.println("");
				aprovados++;
			}
			
		}
		média_médias = média_médias/6;
		
		System.out.println("Total de alunos REPROVADOS: " + reprovados);
		System.out.println("Total de alunos EM EXAME: " + em_exame);
		System.out.println("Total de alunos APROVADOS: " + aprovados);
		System.out.println("Média da classe: " + média_médias);
	}

}
