ackage br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {  
Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a nota 1");
		float nota1 = scanner.nextFloat();
		
		System.out.println("Digite a nota 2");
		float nota2 = scanner.nextFloat();
		

		System.out.println("Digite a nota 3");
		float nota3 = scanner.nextFloat();
		
		float notaTotal = (nota1 + nota2 + nota3)/3;
		
		System.out.println("A media é " + notaTotal);
		
		if (notaTotal >=7 && notaTotal <=10) {
			System.out.println("Aprovado");
			
			
		}
		if (notaTotal <7 && notaTotal >=3 ) {
			System.out.println("Exame");
			float novaNota = (notaTotal - 6) * -1;
			System.out.println("Falta " + novaNota + " para chegar em 6");
			
		
	
			
		}	
        
		if(notaTotal >=0 && notaTotal <3) {
			System.out.println("Reprovado");
		}
		
	}