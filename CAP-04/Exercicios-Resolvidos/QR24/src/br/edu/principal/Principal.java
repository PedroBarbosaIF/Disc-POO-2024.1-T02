package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Questão resolvida QR24: Faça um programa que receba o preço, o tipo (A — alimentação; L — limpeza; e V — vestuário) e a
		refrigeração (S — produto que necessita de refrigeração; e N — produto que não necessita de refri-
		geração) de um produto. Suponha que haverá apenas a digitação de dados válidos e, quando houver
		digitação de letras, utilize maiúsculas. Calcule e mostre:
		
		- O valor adicional, de acordo com a tabela a seguir:
		- O valor do imposto, de acordo com a regra a seguir.
		- O preço de custo, ou seja, preço mais imposto.
		- O desconto, de acordo com a regra a seguir.
		- O novo preço, ou seja, preço de custo mais adicional menos desconto.
		- A classificação, de acordo com a regra a seguir.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		float valor_adicional = 0;
		float imposto = 0;
		float desconto = 0;
		
		System.out.println("Qual o preço do produto?");
		float preço = sc.nextFloat();
		
		System.out.println("Qual o tipo do produto?");
		System.out.println("A - para alimentação");
		System.out.println("L - para limpeza");
		System.out.println("V - vestuário");
		String tipo_do_produto = sc.next();
		
		System.out.println("O produto tem refrigeração?");
		System.out.println("S - para ter refrigeração");
		System.out.println("N - para refrigeração");
		String refrigeração = sc.next();
		
		//CALCULANDO VALOR ADICIONAL SE HOUVER REFRIGERAÇÃO
		if (refrigeração.equals("N")) 
		{
			if (tipo_do_produto.equals("A")) 
			{
				if (preço < 15) 
				{
					valor_adicional = 2;
				}
				
				else valor_adicional = 5;
			}
			// CALCULANDO VALOR ADICIONAL DO ALIMENTO ACIMA
			
			else if (tipo_do_produto.equals("L")) 
			{
				if (preço < 10) 
				{
					valor_adicional = 1.50f;
				}
				
				else valor_adicional = 2.50f;
			}
			//CALCULANDO VALOR ADICONAL DA LIMPEZA ACIMA
			
			else if (tipo_do_produto.equals("V")) 
			{
				if (preço < 30) 
				{
					valor_adicional = 3;
				}
				
				else valor_adicional = 2.50f;
			}
			//CALCULANDO VALOR ADICIONAL DO VESTUÁRIO
		}
		
		//CALCULANDO VALOR ADICIONAL SE NÃO HOUVER REFRIGERAÇÃO
		else if (refrigeração.equals("S")) 
		{
			if (tipo_do_produto.equals("A")) valor_adicional = 8;
			else if (tipo_do_produto == "L" | tipo_do_produto == "V") valor_adicional = 0;
		}
		
		System.out.println("Este é o valor adicional: R$"+ valor_adicional);
		
		if (preço < 25) imposto = 0.05f * preço;
		else if (preço >= 25)  imposto = 0.08f * preço;
		//CALCULANDO IMPOSTO
		
		float preço_de_custo = preço + imposto;
		
		System.out.println("Este é o valor do imposto: R$" + imposto);
		System.out.println("Este é o preço de custo: R$" + preço_de_custo);
		
		
		if (!tipo_do_produto.equals("A") | !refrigeração.equals("S")) 
		{
			desconto = 0.03f * preço_de_custo;
			System.out.println("Este é o desconto: R$" + desconto);
		}
		else desconto = 0;
		
		float preço_final = preço_de_custo + valor_adicional - desconto;
		
		if (preço_final <= 50) System.out.println("Este é o novo preço BARATO: R$" + preço_final);
		
		else if (preço_final > 50 & preço_final < 100) System.out.println("Este é o novo preço NORMAL: R$" + preço_final);
		
		else System.out.print("Este é o novo preço CARO: R$" + preço_final);
		
		
		
		
		
		
		
		
		
		
	}

}
