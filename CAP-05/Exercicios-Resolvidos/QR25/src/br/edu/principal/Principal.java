package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Questão resolvida QR25:Faça um programa que receba os dados a seguir de vários produtos: preço unitário, país de origem
		1 – Estados Unidos; 2 — México; e 3 — outros), meio de transporte (T — terrestre; F — fluvial; e A
		— aéreo), carga perigosa (S — sim; N — não), finalize a entrada de dados com um preço inválido, ou
		seja, menor ou igual a zero. 
		
		O programa deve calcular e mostrar os itens a seguir.
		- O valor do imposto, usando a tabela a seguir.
		- O valor do transporte usando a tabela a seguir.
		- O valor do seguro, usando a regra a seguir.
		- O preço final, ou seja, preço unitário mais imposto mais valor do transporte mais valor do seguro.
		- O total dos impostos.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		String meio_transporte, perigo_carga;
		int origem, valor_transporte = 0;
		float total_impostos = 0, preço_final, seguro, imposto, preço_unitário; 
		//DECLARAÇÃO
		
		System.out.print("Qual o valor do preço unitário?: ");
		preço_unitário = sc.nextFloat(); 
		
		while(preço_unitário > 0 ) 
		{
			System.out.println("Qual o país de origem?: ");
			System.out.println("1 - para Estados Unidos");
			System.out.println("2 - para México");
			System.out.println("3 - para outros");
			origem = sc.nextInt(); 
			//LENDO A ORIGEM
			
			System.out.println("Qual o meio de transporte?: ");
			System.out.println("T - para terrestre");
			System.out.println("F - para fluvial");
			System.out.println("A - para aéreo");
			meio_transporte = sc.next();
			//LENDO MEI ODE TRANSPORTE
			
			System.out.println("A carga é perigosa?: ");
			System.out.println("S - para sim");
			System.out.println("N - para não");
			perigo_carga = sc.next();
			//LENDO PERIGO DA CARGA
			
			if (preço_unitário <= 100) imposto = 0.05f * preço_unitário;
			else imposto = 0.1f * preço_unitário;
			//CALCULANDO IMPOSTO
			
			if (perigo_carga.equals("S")) 
			{
				if (origem == 1) valor_transporte = 50;
				else if (origem == 2) valor_transporte = 21;
				else if (origem == 3) valor_transporte = 24;
				else System.out.println("Digite um valor válido.");
			}
			
			else if (perigo_carga.equals("N")) 
			{
				if (origem == 1) valor_transporte = 12;
				else if (origem == 2) valor_transporte = 21;
				else if (origem == 3) valor_transporte = 60;
				else System.out.println("Digite um valor válido.");
			}
			
			else System.out.println("Digite um valor válido.");
			//CALCULANDO VALOR DO TRANSPORTE
			
			if (origem == 2 | meio_transporte.equals("A")) 
			{
				seguro = preço_unitário * 0.5f;
			}
			else seguro = 0;
			//CALCULANDO O SEGURO
			
			preço_final = preço_unitário + imposto + valor_transporte + seguro;
			total_impostos = total_impostos + imposto;
			//CALCULANDO TOTAL DOS IMPOSTOS 
			
			System.out.println("Este é o valor do imposto: R$" + imposto);
			System.out.println("Este é o valor do trasnporte: R$" + valor_transporte);
			System.out.println("Este é o valor do seguro: R$" + seguro);
			System.out.println("Este é o valor do preço final: R$" + preço_final);
			System.out.println("");
			System.out.println("Qual é o valor do preço do novo produto?:");
			System.out.println("Digite um valor menor ou igual(<=) a 0 para finalizar o programa");
			preço_unitário = sc.nextFloat();
			
		}
		System.out.println("Este é o valor total dos impostos: R$" + total_impostos);
		
	}

}
