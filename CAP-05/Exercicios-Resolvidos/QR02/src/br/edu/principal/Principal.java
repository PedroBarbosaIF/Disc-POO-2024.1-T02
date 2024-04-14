//Faça um programa que leia um valor N inteiro e positivo. Calcule e mostre o valor de E, conforme a
//fórmula a seguir:

//E = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N!

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o valor de n: ");
		int n = scanner.nextInt();
		scanner.close();
		
		float e = 1;
		
		for (int i = 1; i <= n; i++) {
            double fat = 1;
            for (int j = 1; j <= i; j++) {
                fat *= j;
            }
            e += 1.0 / fat;
        }
		
		System.out.println("O valor de e é: " + e);

	}

}
