package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Questão resolvida QR06: Uma empresa possui dez funcionários com as seguintes características: código, número de horas traba-
		lhadas no mês, turno de trabalho (M — matutino; V — vespertino; ou N — noturno), categoria (O —
		operário; ou G — gerente), valor da hora trabalhada. Sabendo-se que essa empresa deseja informatizar
		sua folha de pagamento, faça um programa que:
		
		a) Leia as informações dos funcionários, exceto o valor da hora trabalhada, não permitindo que sejam informa-
		dos turnos e nem categorias inexistentes. Trabalhe sempre com a digitação de letras maiúsculas.
		
		b) Calcule o valor da hora trabalhada, conforme a tabela a seguir. Adote o valor de R$ 450,00 para o salário
		mínimo.
		
		c) Calcule o salário inicial dos funcionários com base no valor da hora trabalhada e no número de horas traba-
		lhadas.
		
		d) Calcule o valor do auxílio alimentação recebido pelo funcionário de acordo com seu salário inicial, conforme
		a tabela a seguir.
		
		e) Mostre o código, número de horas trabalhadas, valor da hora trabalhada, salário inicial, auxílio alimentação
		e salário final (salário inicial + auxílio alimentação).
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int cont = 1, sal_min = 450, código, nht;
		float valor_ht, sal_inicial, auxilio, sal_final;
		String turno, categoria;
		
		while (cont<=10) 
		{
			System.out.print("Qual o código?: ");
			código = sc.nextInt();
			
			System.out.print("Qual o número de horas trabalhadas?: ");
			nht = sc.nextInt();
			
			System.out.println("Qual o turno de trabalho?");
			System.out.println("M - para matutino");
			System.out.println("V - para verpertino");
			System.out.println("N - para noturno");
			turno = sc.next();
			
			System.out.println("Qual a categoria de trabalho?");
			System.out.println("O - para operário");
			System.out.println("G - para gerente");
			categoria = sc.next();
			
			while(!turno.equals("M") & !turno.equals("V") & !turno.equals("N")) 
			{
				System.out.println("Insira um valor válido para o turno de trabalho");
				System.out.println("M - para matutino");
				System.out.println("V - para verpertino");
				System.out.println("N - para noturno");
				turno = sc.next();
			}
			while (!categoria.equals("O") & !categoria.equals("G")) 
			{
				System.out.println("Insira um valor válido para a categoria de trabalho");
				System.out.println("O - para operário");
				System.out.println("G - para gerente");
				categoria = sc.next();
			}
			
			if (categoria.equals("G")) 
			{
				if (turno.equals("N")) 
				{
					valor_ht = 0.18f * sal_min;
				}
				else valor_ht = 0.15f * sal_min;
			}
			else 
			{
				if (turno.equals("N")) 
				{
					valor_ht = 0.13f * sal_min;
				}
				else valor_ht = 0.1f * sal_min;
			}
			sal_inicial = nht * valor_ht;
			
			if (sal_inicial <=300) 
			{
				auxilio = 0.2f * sal_inicial;
			}
			else if (sal_inicial > 300 & sal_inicial < 600) 
			{
				auxilio = 0.15f * sal_inicial;
			}
			else auxilio = 0.05f * sal_inicial;
			
			sal_final = sal_inicial + auxilio;
			System.out.println("Este é o valor do código: " + código);
			System.out.println("Este é o número de horas trabalhadas: " + nht);
			System.out.println("Este é o valor da hora trabalhada: " + valor_ht);
			System.out.println("Este é o valor do salário inicial: R$" + sal_inicial);
			System.out.println("Este é o valor do auxílio: R$" + auxilio);
			System.out.println("Este é o valor do salário final : R$" + sal_final);
			cont++;
		}
	}

}
