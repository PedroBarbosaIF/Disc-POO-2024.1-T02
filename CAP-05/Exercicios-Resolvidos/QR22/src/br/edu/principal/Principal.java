package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Questão resolvida QR22: Uma empresa decidiu fazer um levantamento em relação aos candidatos que se apresentarem para
		preenchimento de vagas em seu quadro de funcionários. Supondo que você seja o programador dessa
		empresa, faça um programa que leia, para cada candidato, a idade, o sexo (M ou F) e a experiência no
		serviço (S ou N). Para encerrar a entrada de dados, digite zero para a idade.
		
		- o número de candidatos do sexo feminino;
		- o número de candidatos do sexo masculino;
		- a idade média dos homens que já têm experiência no serviço;
		- a porcentagem dos homens com mais de 45 anos entre o total dos homens;
		- o número de mulheres com idade inferior a 21 anos e com experiência no serviço;
		- a menor idade entre as mulheres que já têm experiência no serviço.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a idade do(a) candidato(a)?: ");
		byte idade = sc.nextByte();
		System.out.println("");
		
		String sexo, experiência;
		int cont_m = 0, cont_h = 0, cont_h_s = 0, cont_m_s = 0, cont_h_n = 0, cont_m_n = 0, total = 0, cont_m1 = 0, cont_h1 = 0,
		soma1 = 0, cont_h2 = 0;
		
		byte menor_idade = 0;
		
		while (idade > 0) 
		{
			System.out.println("Qual o sexo do(a) candidato(a)?: ");
			System.out.println("M - para masculino");
			System.out.println("F - para feminino");
			sexo = sc.next();
			System.out.println("");
			//LENDO O SEXO
			
			System.out.println("O(a)candidato(a) tem experiência?: ");
			System.out.println("S - para sim");
			System.out.println("N - para não");
			experiência = sc.next();
			System.out.println("");
			//LENDO EXPERIÊNCIA
			
			if (sexo.equals("F") & experiência.equals("S")) 
			{
				if (total == 0) 
				{
					menor_idade = idade;
					total++;
				}
				else if(idade < menor_idade) menor_idade = idade;
			}
			if (sexo.equals("M")) cont_h++;
			if (sexo.equals("F")) cont_m++;
			if (sexo.equals("F") & idade < 21 & experiência.equals("S")) cont_m1++;
			if (sexo.equals("M") & idade > 45) cont_h1++;
			if (sexo.equals("M") & experiência.equals("S")) 
			{
				soma1 = soma1 + idade;
				cont_h2++;
			}
			
			System.out.println("Qual a nova idade do(a) candidato(a)?: ");
			System.out.println("Digite 0 para encerrar o programa");
			idade = sc.nextByte();
		}
		System.out.println("Este é o total de mulheres: " + cont_m);
		System.out.println("Este é o total de homens: " + cont_h);
		
		if (cont_h2 == 0) System.out.println("Nenhum homem com experiência");
		else 
		{
			float média_idade = soma1 / cont_h2;
			System.out.println("Média de homens com experiência: " + média_idade);
		}
		
		if (cont_h == 0) System.out.println("Nenhum homem com mais de 45 anos");
		else 
		{
			float porcentagem = cont_h1 * 100 / cont_h;
			System.out.println("Porcentagem de homens com mais de 45: " + porcentagem + "%");
		}
		System.out.println("Este é o número de mulheres com idade inferior a 21 anos e com experiência no serviço: " + cont_m1);
		System.out.println("Esta é a menor idade entre as mulheres que já têm experiência no serviço: "+ menor_idade);
		
	}

}
