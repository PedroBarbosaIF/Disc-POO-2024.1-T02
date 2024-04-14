package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		/**
		 * Questão 20:
		 * Faça um programa para ler o código, o sexo (M — masculino; F — feminino) e o número de horas/
		 * aula dadas mensalmente pelos professores de uma universidade, sabendo-se que cada hora/aula vale 
		 * R$ 30,00. Emita uma listagem contendo o código, o salário bruto e o salário líquido (levando em 
		 * consideração os descontos explicados a seguir) de todos os professores. Mostre também a média dos 
		 * salários líquidos dos professores do sexo masculino e a média dos salários líquidos dos professores do 
		 * sexo feminino. Considere:
		 * - Desconto para homens, 10%, e, para mulheres, 5%;
		 * - As informações terminarão quando for lido o código = 99999.
		 */
		
		        Scanner scanner = new Scanner(System.in);
		        
		        int codigo;
		        char sexo;
		        int horasAula;
		        
		        int totalHomens = 0, totalMulheres = 0;
		        double salarioBruto, salarioLiquido, totalSalarioHomens = 0, totalSalarioMulheres = 0;
		        
		        do {
		            System.out.print("Digite o código do professor (ou 99999 para encerrar): ");
		            codigo = scanner.nextInt();
		            if (codigo == 99999) {
		                break;
		            }
		            
		            System.out.print("Digite o sexo do professor (M/F): ");
		            sexo = scanner.next().charAt(0);
		            
		            System.out.print("Digite o número de horas/aula dadas mensalmente: ");
		            horasAula = scanner.nextInt();
		            
		            salarioBruto = horasAula * 30.0;
		            if (sexo == 'M') {
		                salarioLiquido = salarioBruto * 0.9; // Desconto de 10% para homens
		                totalSalarioHomens += salarioLiquido;
		                totalHomens++;
		            } else {
		                salarioLiquido = salarioBruto * 0.95; // Desconto de 5% para mulheres
		                totalSalarioMulheres += salarioLiquido;
		                totalMulheres++;
		            }
		            
		            System.out.println("Código: " + codigo);
		            System.out.println("Salário Bruto: R$" + salarioBruto);
		            System.out.println("Salário Líquido: R$" + salarioLiquido);
		            System.out.println("------------------------------------");
		        } while (codigo != 99999);
		        
		        if (totalHomens > 0) {
		            double mediaSalarioHomens = totalSalarioHomens / totalHomens;
		            System.out.println("Média dos salários líquidos dos professores do sexo masculino: R$" + mediaSalarioHomens);
		        } else {
		            System.out.println("Nenhum professor do sexo masculino encontrado.");
		        }
		        
		        if (totalMulheres > 0) {
		            double mediaSalarioMulheres = totalSalarioMulheres / totalMulheres;
		            System.out.println("Média dos salários líquidos dos professores do sexo feminino: R$" + mediaSalarioMulheres);
		        } else {
		            System.out.println("Nenhum professor do sexo feminino encontrado.");
		        }
		        
		        scanner.close();

	}

}
