package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	
		/**
		 * Questão 13:
		 * Faça um programa que apresente o menu a seguir, permita ao usuário escolher a opção desejada, re-
		 * ceba os dados necessários para executar a operação e mostre o resultado. Verifique a possibilidade de 
		 * opção inválida e não se preocupe com restrições, como salário negativo.
		 * Menu de opções:
		 * 1. Imposto 
		 * 2. Novo salário 
		 * 3. Classificação 
		 * Digite a opção desejada. 
		 */
	

		
		        Scanner scanner = new Scanner(System.in);
		        int opcao;
		        double salario;

		        System.out.println("Menu de opções:");
		        System.out.println("1. Imposto");
		        System.out.println("2. Novo salário");
		        System.out.println("3. Classificação");
		        System.out.print("Digite a opção desejada: ");
		        opcao = scanner.nextInt();

		        switch (opcao) {
		            case 1:
		                System.out.print("Digite o salário do funcionário: ");
		                salario = scanner.nextDouble();
		                double imposto;
		                if (salario < 500) {
		                    imposto = salario * 0.05;
		                } else if (salario <= 850) {
		                    imposto = salario * 0.1;
		                } else {
		                    imposto = salario * 0.15;
		                }
		                System.out.println("Valor do imposto a ser pago: R$" + imposto);
		                break;
		            case 2:
		                System.out.print("Digite o salário do funcionário: ");
		                salario = scanner.nextDouble();
		                double novoSalario;
		                if (salario > 1500) {
		                    novoSalario = salario + 25;
		                } else if (salario >= 750) {
		                    novoSalario = salario + 50;
		                } else if (salario >= 450) {
		                    novoSalario = salario + 75;
		                } else {
		                    novoSalario = salario + 100;
		                }
		                System.out.println("Novo salário: R$" + novoSalario);
		                break;
		            case 3:
		                System.out.print("Digite o salário do funcionário: ");
		                salario = scanner.nextDouble();
		                if (salario <= 700) {
		                    System.out.println("Classificação: Mal remunerado");
		                } else {
		                    System.out.println("Classificação: Bem remunerado");
		                }
		                break;
		            default:
		                System.out.println("Opção inválida.");
		        }
		        scanner.close();
		    }
	

}


