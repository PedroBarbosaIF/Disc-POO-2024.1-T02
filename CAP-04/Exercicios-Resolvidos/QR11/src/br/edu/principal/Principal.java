/*11. Faça um programa que receba a hora do início de um jogo e a hora do término (cada hora é composta
por duas variáveis inteiras: hora e minuto). Calcule e mostre a duração do jogo (horas e minutos),
sabendo que o tempo máximo de duração do jogo é de 24 horas e que ele pode começar em um dia e
terminar no dia seguinte.*/

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hora_i, min_i, hora_f, min_f, hora_d, min_d;
		
		System.out.println("Digite o horário inicial");
		System.out.println("Hora: ");
		hora_i = sc.nextInt ();
		System.out.println("Minuto: ");
		min_i = sc.nextInt ();
		System.out.println("Digite o horário final");
		System.out.println("Hora: ");
		hora_f = sc.nextInt ();
		System.out.println("Minuto: ");
		min_f = sc.nextInt ();
		
		if (min_i > min_f) {
			min_f = min_f+60;
			hora_f = hora_f-1;
	}else if (hora_i > hora_f)
				hora_f = hora_f+24;
				min_d = min_f-min_i;
				hora_d = hora_f-hora_i;
		System.out.println("O jogo durou: " + hora_d + "horas(s) e " + min_d + " minutos(s)");
		
	}

}
