//Faça um programa que leia um número N que indica quantos valores inteiros e positivos devem ser
//lidos a seguir. Para cada número lido, mostre uma tabela contendo o valor lido e o fatorial desse valor.

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n, num, fat;
		
		System.out.print("Digite o número de valores a serem lidos: ");
        n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
        	System.out.print("Digite um número inteiro e positivo: ");
            num = scanner.nextInt();
            fat = 1;
            for (int j = 1; j <= num; j++) {
                fat *= j;
            }
            System.out.println("Valor lido: " + num + ", Fatorial: " + fat);
        }
		

	}

}
