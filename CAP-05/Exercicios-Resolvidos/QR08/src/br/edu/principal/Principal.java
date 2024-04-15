/*8. Faça um programa que leia o número de termos, determine e mostre os valores de acordo com a série
a seguir: 2, 7, 3, 4, 21, 12, 8, 63, 48, 16, 189, 192, 32, 567, 768...*/

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i, numtermos, num1, num2, num3;
		
		System.out.println("Digite o número de termos: ");
		numtermos= sc.nextInt ();
		
		num1=2;
		num2=7;
		num3=3;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		i=4;
		
		while (i != numtermos)
		{
			num1=num1*2;
			System.out.println(num1);
			i=i+1;
			if (i != numtermos)
			{
				num2=num2*3;
				System.out.println(num2);
				i=i+1;
			}
			if (i != numtermos)
			{
				num3=num3*4;
				System.out.println(num3);
				i=i+1;
			}
		}
		
	}

}
