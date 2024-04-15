package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		/*
		7. Faça um programa que receba quatro valores: I, A, B e C. Desses valores, I é inteiro e positivo, A, B e 
		C são reais. Escreva os números A, B e C obedecendo à tabela a seguir.
		Suponha que o valor digitado para I seja sempre um valor válido, ou seja, 1, 2 ou 3, e que os números 
		digitados sejam diferentes um do outro.
		VALor dE i ForMA A EsCrEVEr
		1 A, B e C em ordem crescente.
		2 A, B e C em ordem decrescente.
		3 O maior fica entre os outros dois números.
		*/

		
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Digite o valor de I (1, 2 ou 3):");
		        int I = scanner.nextInt();

		        System.out.println("Digite o valor de A:");
		        double A = scanner.nextDouble();

		        System.out.println("Digite o valor de B:");
		        double B = scanner.nextDouble();

		        System.out.println("Digite o valor de C:");
		        double C = scanner.nextDouble();

		        switch (I) {
		            case 1:
		                if (A < B && A < C) {
		                    if (B < C) {
		                        System.out.println("Em ordem crescente: " + A + ", " + B + ", " + C);
		                    } else {
		                        System.out.println("Em ordem crescente: " + A + ", " + C + ", " + B);
		                    }
		                } else if (B < A && B < C) {
		                    if (A < C) {
		                        System.out.println("Em ordem crescente: " + B + ", " + A + ", " + C);
		                    } else {
		                        System.out.println("Em ordem crescente: " + B + ", " + C + ", " + A);
		                    }
		                } else {
		                    if (A < B) {
		                        System.out.println("Em ordem crescente: " + C + ", " + A + ", " + B);
		                    } else {
		                        System.out.println("Em ordem crescente: " + C + ", " + B + ", " + A);
		                    }
		                }
		                break;

		            case 2:
		                if (A > B && A > C) {
		                    if (B > C) {
		                        System.out.println("Em ordem decrescente: " + A + ", " + B + ", " + C);
		                    } else {
		                        System.out.println("Em ordem decrescente: " + A + ", " + C + ", " + B);
		                    }
		                } else if (B > A && B > C) {
		                    if (A > C) {
		                        System.out.println("Em ordem decrescente: " + B + ", " + A + ", " + C);
		                    } else {
		                        System.out.println("Em ordem decrescente: " + B + ", " + C + ", " + A);
		                    }
		                } else {
		                    if (A > B) {
		                        System.out.println("Em ordem decrescente: " + C + ", " + A + ", " + B);
		                    } else {
		                        System.out.println("Em ordem decrescente: " + C + ", " + B + ", " + A);
		                    }
		                }
		                break;

		            case 3:
		                if (A > B && A > C) {
		                    System.out.println("O maior fica entre os outros dois números: " + B + ", " + A + ", " + C);
		                } else if (B > A && B > C) {
		                    System.out.println("O maior fica entre os outros dois números: " + A + ", " + B + ", " + C);
		                } else {
		                    System.out.println("O maior fica entre os outros dois números: " + A + ", " + C + ", " + B);
		                }
		                break;

		            default:
		                System.out.println("Valor inválido para I. Por favor, digite 1, 2 ou 3.");
		        }

		        scanner.close();
		    }
		}


	
