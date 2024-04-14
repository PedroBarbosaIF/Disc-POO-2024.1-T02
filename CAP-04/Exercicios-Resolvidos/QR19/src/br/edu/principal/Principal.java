package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	
		/**
		 * Questão 19:
		 * Faça um programa que receba a altura e o peso de uma pessoa. De acordo com a tabela a seguir, verifique e mostre a classificação dessa pessoa.
		 * Altura             Peso
		 *                    Até 60       Entre 60 e 90 (inclusive)     Acima de 90
		 * Menores que 1,20   A            D                              G
		 * De 1,20 a 1,70     B            E                              H
		 * Maiores que 1,70   C            F                              I
		 */
		
		        Scanner scanner = new Scanner(System.in);
		        
		        double altura, peso;
		        
		        System.out.print("Digite a altura (em metros): ");
		        altura = scanner.nextDouble();
		        System.out.print("Digite o peso (em quilogramas): ");
		        peso = scanner.nextDouble();
		        
		        if (altura < 1.20) {
		            if (peso <= 60) {
		                System.out.println("Classificação: A");
		            } else if (peso <= 90) {
		                System.out.println("Classificação: D");
		            } else {
		                System.out.println("Classificação: G");
		            }
		        } else if (altura <= 1.70) {
		            if (peso <= 60) {
		                System.out.println("Classificação: B");
		            } else if (peso <= 90) {
		                System.out.println("Classificação: E");
		            } else {
		                System.out.println("Classificação: H");
		            }
		        } else {
		            if (peso <= 60) {
		                System.out.println("Classificação: C");
		            } else if (peso <= 90) {
		                System.out.println("Classificação: F");
		            } else {
		                System.out.println("Classificação: I");
		            }
		        }
		        
		        scanner.close();
		    }
		}

	