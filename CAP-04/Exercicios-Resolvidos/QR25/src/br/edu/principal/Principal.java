package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Questão resolvida QR25: Faça um programa que receba a medida de um ângulo em graus. Calcule e mostre o quadrante em que
		se localiza esse ângulo. Considere os quadrantes da trigonometria e, para ângulos maiores que 360o ou
		menores que −360o, reduzi-los, mostrando também o número de voltas e o sentido da volta (horário
		ou anti-horário).*/
		
		Scanner sc = new Scanner(System.in);
		
		int voltas;
		float angulo, voltasfloat;
		
		
		System.out.print("Digite o valor de um ângulo: ");
		angulo  = sc.nextFloat();
		final float angulo_inicial = angulo;
		
		if (angulo > 360 || angulo < -360) 
		{
			voltasfloat = angulo/360;
			voltas = (int)voltasfloat;
			
			angulo = angulo%360;
		}
		else voltas = 0;
		
		if ((angulo > 0 & angulo < 90) | (angulo < -270 & angulo > -360)) 
		{
			System.out.println("Está no 1° quadrante");
		}
		
		else if ((angulo > 90 & angulo < 180) | (angulo < -180 & angulo > -270)) 
		{
			System.out.println("Está no 2° quadrante");
		}
		
		else if ((angulo > 180 & angulo < 270) | (angulo < -90 & angulo > -180)) {
			System.out.println("Está no 3° quadrante");
		}
		
		else if ((angulo > 270 & angulo < 360) | (angulo < 0 & angulo > -90)) {
			System.out.println("Está no 4° quadrante");
		}
		
		else System.out.println("- Está em cima de algum dos eixos");
		
		if (angulo_inicial > 0 ) 
		{
			System.out.println("- "+ voltas + " volta(s) no sentido anti-horário");
		}
		
		else System.out.print("- "+ voltas + " volta(s) no sentido horário");
		
	}

}
