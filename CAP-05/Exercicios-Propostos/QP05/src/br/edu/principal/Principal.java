package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		/*Questão proposta QP05: Faça um programa que mostre as tabuadas dos números de 1 a 10.*/
		
		int limite = 1, x, calculo;
		
		
		while (limite <= 10) 
		{
			System.out.println("Tabuada de "+ limite+ ":");
			for(x = 1;x <=10;x++) {
				calculo = limite * x;
				System.out.println(limite+" * "+ x+ " = "+ calculo);
				
			}
			System.out.println("");
			limite++;
		}
		
	}

}
