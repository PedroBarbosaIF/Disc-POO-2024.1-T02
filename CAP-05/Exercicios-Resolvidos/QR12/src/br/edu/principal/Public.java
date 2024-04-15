/*12. Em uma fábrica trabalham homens e mulheres divididos em três classes:
■■ trabalhadores que fazem até 30 peças por mês — classe 1;
■■ trabalhadores que fazem de 31 a 50 peças por mês — classe 2;
■■ trabalhadores que fazem mais de 50 peças por mês — classe 3.
A classe 1 recebe salário mínimo. A classe 2 recebe salário mínimo mais 3% deste salário por peça,
acima das 30 peças iniciais. A classe 3 recebe salário mínimo mais 5% desse salário por peça, acima das 30
peças iniciais.
Faça um programa que receba o número do operário, o número de peças fabricadas no mês, o sexo do
operário, e que também calcule e mostre:
■■ o número do operário e seu salário;
■■ o total da folha de pagamento da fábrica;
■■ o número total de peças fabricadas no mês;

128 | Fundamentos da programação de computadores

■■ a média de peças fabricadas pelos homens;
■■ a média de peças fabricadas pelas mulheres; e
■■ o número do operário ou operária de maior salário.
A fábrica possui 15 operários.*/

package br.edu.principal;

import java.util.Scanner;

public class Public {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 final int numoperarios = 15;
	        int[] numerooperario = new int[numoperarios];
	        int[] numpecas = new int[numoperarios];
	        char[] sexo = new char[numoperarios];
	        double[] salario = new double[numoperarios];
	        double salariototal = 0;
	        int totalpecas = 0;
	        int totalpecashomens = 0;
	        int totalpecasmulheres = 0;
	        double maiorsalario = 0;
	        int indicemaiorsalario = 0;

	        for (int i = 0; i < numoperarios; i++) {
	            System.out.println("Digite o número do operário " + (i + 1) + ":");
	            numerooperario[i] = sc.nextInt();
	            System.out.println("Digite o número de peças fabricadas pelo operário " + (i + 1) + ":");
	            numpecas[i] = sc.nextInt();
	            System.out.println("Digite o sexo do operário " + (i + 1) + " (M/F):");
	            sexo[i] = sc.next().charAt(0);
	        }

	        for (int i = 0; i < numoperarios; i++) {
	            if (numpecas[i] <= 30) {
	                salario[i] = 1100;
	            } else {
	                double percentual = sexo[i] == 'M' ? 0.03 : 0.05;
	                salario[i] = 1100 + (numpecas[i] - 30) * (1100 * percentual);
	            }
	            
	            salariototal += salario[i];
	            totalpecas += numpecas[i];
	            if (sexo[i] == 'M') {
	                totalpecashomens += numpecas[i];
	            } else {
	                totalpecasmulheres += numpecas[i];
	            }
	            if (salario[i] > maiorsalario) {
	                maiorsalario = salario[i];
	                indicemaiorsalario = i;
	            }
	        }

	        System.out.println("Número do operário\tSalário");
	        for (int i = 0; i < numoperarios; i++) {
	            System.out.println(numerooperario[i] + "\t\t\t\t" + salario[i]);
	        }
	        System.out.println("Total da folha de pagamento: " + salariototal);
	        System.out.println("Total de peças fabricadas no mês: " + totalpecas);
	        System.out.println("Média de peças fabricadas pelos homens: " + (double) totalpecashomens / (numoperarios / 2));
	        System.out.println("Média de peças fabricadas pelas mulheres: " + (double) totalpecasmulheres / (numoperarios / 2));
	        System.out.println("Operário ou operária de maior salário: " + numerooperario[indicemaiorsalario]);
	    }
		
	}