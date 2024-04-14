package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Questão resolvida QR21: 
		  
		Faça um programa que receba:
		- o código do estado de origem da carga de um caminhão, supondo que a digitação do código do
		estado seja sempre válida, isto é, um número inteiro entre 1 e 5;  
		- o peso da carga do caminhão em toneladas;
		- o código da carga, supondo que a digitação do código seja sempre válida, isto é, um número inteiro
		entre 10 e 40.
		
		Calcule e mostre:
		- o peso da carga do caminhão convertido em quilos;
		- o preço da carga do caminhão;
		- o valor do imposto, sabendo que o imposto é cobrado sobre o preço da carga do caminhão e de-
		pende do estado de origem;
		- o valor total transportado pelo caminhão, preço da carga mais imposto.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o código do estado de origem?(entre 1 a 5): ");
		byte código_estado = sc.nextByte();
		
		System.out.print("Qual o peso da carga do caminhão(em toneladas)?: ");
		float peso_toneladas = sc.nextFloat();
		
		System.out.print("Qual o código da carga(entre 10 a 40)?: ");
		byte código_carga = sc.nextByte();
		//DECLARANDO E LENDO
		
		float peso_quilos = peso_toneladas * 1000;
		System.out.println("Este é peso da carga em quilos: "+ peso_quilos + "kg");
		//CALCULANDO PESO EM KG
		
		int preço_porkg = 0;
		if (código_carga >= 10 & código_carga <=20) preço_porkg = 100;
		else if (código_carga >= 21 & código_carga <= 30) preço_porkg = 250;
		else if (código_carga >= 31 & código_carga <= 40) preço_porkg = 340;
		else System.out.println("Digite um código válido.");
		float preço_carga = peso_quilos * preço_porkg;
		System.out.println("Este é o preço da carga(por kg): R$" + preço_carga);
		//CALCULANDO PREÇ ODA CARGA
		
		float imposto = 0;
		if (código_estado == 1) imposto = 0.35f * preço_carga;
		else if (código_estado == 2) imposto = 0.25f * preço_carga;
		else if (código_estado == 3) imposto = 0.15f * preço_carga;
		else if (código_estado == 4) imposto = 0.05f * preço_carga;
		else if (código_estado == 5) imposto = 0;
		else System.out.println("Digite um código válido.");
		System.out.println("Este é o valor do imposto: R$" + imposto);
		//CALCULANDO IMPOSTO
		
		float valor_total = preço_carga + imposto;
		System.out.println("Este é o valor total transportado pelo caminhão: R$" + valor_total);
		
		
	}

}
