package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Questão resolvida QR23: Faça um programa que receba o valor do salário mínimo, o turno de trabalho (M — matutino; V
		— vespertino; ou N — noturno), a categoria (O — operário; G — gerente) e o número de horas tra-
		balhadas no mês de um funcionário. Suponha a digitação apenas de dados válidos e, quando houver
		digitação de letras, utilize maiúsculas. Calcule e mostre:
		
		- O coeficiente do salário, de acordo com a tabela a seguir.
		- O valor do salário bruto, ou seja, o número de horas trabalhadas multiplicado pelo valor do coe-
		ficiente do salário.
		- O imposto, de acordo com a tabela a seguir.
		- A gratificação, de acordo com as regras a seguir.
		- O auxílio alimentação, de acordo com as seguintes regras.
		- O salário líquido, ou seja, salário bruto menos imposto mais gratificação mais auxílio alimentação.
		- A classificação, de acordo com a tabela a seguir:
		*/
		
		Scanner sc = new Scanner(System.in);
		
		float salario_minimo, auxilio, salario_liquido, coeficiente = 0, imposto = 0;
		String turno, categoria;
		int horas_trabalhadas, gratificação;
		
		System.out.println("Qual o valor do salário mínimo?: ");
		salario_minimo = sc.nextFloat();
		
		System.out.println("Qual o número de horas trabalhadas?: ");
		horas_trabalhadas = sc.nextInt();
		
		System.out.println("Qual é o turno do trabalho?");
		System.out.println("M - para matutino");
		System.out.println("V - verspertino");
		System.out.println("N - noturno");
		turno = sc.next();
		
		System.out.println("Qual é a categoria de trabalho?: ");
		System.out.println("O - para operário");
		System.out.println("G - para gerente");
		categoria = sc.next();
		
		if (turno.equals("M")) 
		{
			coeficiente = 0.1f * salario_minimo;
		}
		
		else if (turno.equals("V")) 
		{
			coeficiente = 0.15f * salario_minimo;
		}
		
		else if (turno.equals("N")) 
		{
			coeficiente = 0.12f * salario_minimo;
		}
		
		else System.out.println("Digite um valor válido.");
		// CALCULANDO COEFICIENTE DO SALÁRIO
		System.out.println("Este é o valor coeficiente do salário: R$" + coeficiente);
		
		float salario_bruto = horas_trabalhadas * coeficiente;
		System.out.println("Este é o valor do salário bruto: R$" + salario_bruto);
		
		if (categoria.equals("O")) 
		{
			if(salario_bruto >= 300) imposto = 0.05f * salario_bruto;
			
			else imposto = 0.03f * salario_bruto;
		}
		
		else if (categoria.equals("G")) 
		{
			if(salario_bruto >= 400) imposto = 0.06f * salario_bruto;
			
			else imposto = 0.04f * salario_bruto;
		}
		
		else System.out.println("Digite um valor válido.");
		//CALCULANDO O VALOR DO IMPOSTO
		System.out.println("Este é o valor do imposto: R$" + imposto);
		
		if (turno.equals("N") & horas_trabalhadas > 80) gratificação = 50;
		else gratificação = 30;
		System.out.println("Este é o valor da gratificação: R$" + gratificação);
		//CALCULANDO GRATIFICAÇÃO
		
		if (categoria.equals("O") & coeficiente <= 2.5f) auxilio = 0.33f * salario_bruto;
		else auxilio = 0.5f * salario_bruto;
		System.out.println("Este é o valor do auxílio alimentação: R$" + auxilio);
		//CALCULANDO AUXÍLIO
		
		salario_liquido = salario_bruto - imposto + gratificação + auxilio;
		System.out.println("Este é o valor do salário líquido: ");
		System.out.println(salario_liquido + "(salário líquido) = " + salario_bruto + "(salario_bruto) - " + imposto + "(imposto) + " + gratificação + "(gratificação) + " + auxilio + "(auxilio)" );
		//CALCULANDO SALÁRIO LÍQUIDO
		
		if (salario_liquido < 350) System.out.println("O salário líquido é MAL REMUNERADO");
		else if (salario_liquido >= 350 & salario_liquido <= 600 ) System.out.println("O salário líquido é NORMAL");
		else System.out.println("O salário líquido é BEM REMUNERADO");
		
	}

}
