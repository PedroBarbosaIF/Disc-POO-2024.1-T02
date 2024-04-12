package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Questão proposta QP15: Uma agência bancária possui dois tipos de investimentos, conforme o quadro a seguir. Faça um pro-
		grama que receba o tipo de investimento e seu valor, calcule e mostre o valor corrigido após um mês de
		investimento, de acordo com o tipo de investimento.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual será seu tipo de investimento?");
		System.out.println("Digite '1' para poupança");
		System.out.println("Digite '2' para fundos de renda fixa");
		
		byte tipo_de_investimento = sc.nextByte();
		
		System.out.println("Qual o valor do investimento?: ");
		float valor_do_investimento = sc.nextFloat();
		
		if (tipo_de_investimento == 1) 
		{
			float valor_reajustado = 1.03f * valor_do_investimento; 
			System.out.print("Este é/será o valor da poupança após um mês: R$"+ valor_reajustado );
		}
		
		if (tipo_de_investimento == 2) 
		{
			float valor_reajustado = 1.04f * valor_do_investimento; 
			System.out.print("Este é/será o valor do 'fundos de renda fixa' após um mês: R$"+ valor_reajustado );
		}
		
		else System.out.print("Escolha um tipo de investimento válido: 1 ou 2.");
	}

}
