package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
	
		/**
		 * Questão 17:
		 * Faça um programa que receba o salário de um funcionário chamado Carlos. Sabe-se que outro funcionário,
		 * João, tem salário equivalente a um terço do salário de Carlos. Carlos aplicará seu salário integralmente
		 * na caderneta de poupança, que rende 2% ao mês, e João aplicará seu salário integralmente no fundo de
		 * renda fixa, que rende 5% ao mês. O programa deverá calcular e mostrar a quantidade de meses necessários
		 * para que o valor pertencente a João iguale ou ultrapasse o valor pertencente a Carlos.
		 */
		
		        double salarioCarlos = 2000; // Exemplo de salário para Carlos
		        double salarioJoao = salarioCarlos / 3;
		        
		        double valorCarlos = salarioCarlos;
		        double valorJoao = salarioJoao;
		        
		        int meses = 0;
		        
		        while (valorJoao <= valorCarlos) {
		            valorCarlos *= 1.02; // Rendimento da poupança
		            valorJoao *= 1.05; // Rendimento do fundo de renda fixa
		            meses++;
		        }
		        
		        System.out.println("Quantidade de meses necessários: " + meses);

	}

}
