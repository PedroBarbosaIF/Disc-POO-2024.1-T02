package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Questão proposta QP19: Faça um programa que receba a altura e o sexo de uma pessoa e calcule e mostre seu peso ideal, utilizan-
		do as seguintes fórmulas (onde h é a altura):
		
		- para homens: (72.7 * h) – 58.
		- para mulheres: (62.1 * h) – 44.7.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a sua altura?: ");
		float altura = sc.nextFloat();
		
		System.out.print("Qual é o seu sexo biológico?('1' para mulher e '2' para homem): ");
		byte sexo = sc.nextByte();
		
		
		if (sexo== 1) 
		{
			 float peso = (62.1f * altura) - 44.7f;
			 System.out.print("Este é seu peso ideal: " + peso);
		}
		
		else if (sexo == 2) 
		{
			float peso = (72.7f * altura) - 58;
			System.out.print("Este é seu peso ideal: " + peso);
		}
		
		else System.out.print("Digitou algo errado.");
	}

}
