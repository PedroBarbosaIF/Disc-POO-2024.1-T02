package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	
		/**
		 * Questão 14:
		 * Faça um programa que receba o salário inicial de um funcionário, calcule e mostre o novo salário, 
		 * acrescido de bonificação e de auxílio escola.
		 */
		
		        Scanner scanner = new Scanner(System.in);
		        double salarioInicial, novoSalario, bonificacao, auxilioEscola;

		        System.out.print("Digite o salário inicial do funcionário: ");
		        salarioInicial = scanner.nextDouble();

		     
		        if (salarioInicial <= 500) {
		            bonificacao = salarioInicial * 0.05;
		        } else if (salarioInicial <= 1200) {
		            bonificacao = salarioInicial * 0.12;
		        } else {
		            bonificacao = 0;
		        }

		       
		        if (salarioInicial <= 600) {
		            auxilioEscola = 150;
		        } else {
		            auxilioEscola = 100;
		        }

		        novoSalario = salarioInicial + bonificacao + auxilioEscola;
		        
		        System.out.println("Novo salário: R$" + novoSalario);
		        
		        scanner.close();
		    }
		

	}


