/*9. Faça um programa que mostre a data e a hora do sistema nos seguintes formatos: DD/MM/AAAA –
mês por extenso e hora:minuto.*/

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int dia, mes, ano, hora, min;
		
		System.out.println("Escreva o dia: ");
		dia = sc.nextInt();
		System.out.println("Escreva o mês: ");
		mes =  sc.nextInt();
		System.out.println("Escreva o ano: ");
		ano =  sc.nextInt();
		System.out.println("Data Atual: " + dia + "/" + mes + "/" + ano + "_");
		
		if (mes == 1) {
			System.out.println("Mês: Janeiro");
		} else if (mes == 2) {
			System.out.println("Mês: Fevereiro");
		} else if (mes == 3) {
			System.out.println("Mês: Março");
		} else if (mes == 4) {
			System.out.println("Mês: Abril");
		} else if (mes == 5) {
			System.out.println("Mês: Maio");
		} else if (mes == 6) {
			System.out.println("Mês: junho");
		} else if (mes == 7) {
			System.out.println("Mês: julho");
		} else if (mes == 8) {
			System.out.println("Mês: Agosto");
		} else if (mes == 9) {
			System.out.println("Mês: Setembro");
		} else if (mes == 10) {
			System.out.println("Mês: Outubro");
		} else if (mes == 11) {
			System.out.println("Mês: Novembro");
		} else if (mes == 12) {
			System.out.println("Mês: Dezembro");
		}
		
		System.out.println("Informe a hora: ");
		hora = sc.nextInt ();
		System.out.println("Informe o min: ");
		min = sc.nextInt ();
		System.out.println("Hora atual: " + hora + ":" + min);
		}
	}