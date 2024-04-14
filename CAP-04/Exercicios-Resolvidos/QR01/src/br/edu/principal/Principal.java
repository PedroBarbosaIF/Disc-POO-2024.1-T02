
// 01. nota final de um estudante é calculada a partir de três notas atribuídas, respectivamente, a um traba-lho de laboratório, a uma avaliação semestral e a um exame final. A média das três notas mencionadas
//obedece aos pesos a seguir:

//Nota PESO
//Trabalho de laboratório 2
//Avaliação semestral 
//Exame final 5

//Faça um programa que receba as três notas, calcule e mostre a média ponderada e o conceito que segue
//a tabela:

//MÉDIA PONDERADA CONCEITO
//8,0      10,0      A
//7,0       8,0      B
//6,0       7,0      C
//5,0       6,0      D
///0,0      5,0      E

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a nota do trabalho do laboratório");
		float nota1 = scanner.nextFloat();
		
		System.out.println("Digite a nota da avaliação semestral ");
		float nota2 = scanner.nextFloat();
		
		System.out.println("Digite a nota do exame final");
		float nota3 = scanner.nextFloat();
		
		
		float resultado = (nota1 * 2 + nota2 * 3 + nota3 * 5)/10;
		
		System.out.println("A média ponderada é " + resultado);
		
        if (resultado >= 8 && resultado<=10){
        	System.out.println("A");
        }
        if(resultado >= 7 && resultado<8) {
        	System.out.println("B");         
        }
        if(resultado >=6 && resultado<7) {
        	System.out.println("C");
        	
        	}
        if(resultado >=5 && resultado<6) {
        	System.out.println("D");
        }
        
        if(resultado <5) {
        	System.out.println("E");
        }
       
        	
        }
	}