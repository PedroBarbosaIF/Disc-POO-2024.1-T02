package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		/**
		 * Questão 15:
		 * Faça um programa que receba o valor do salário mínimo, o número de horas trabalhadas, o número
		 * de dependentes do funcionário e a quantidade de horas extras trabalhadas. Calcule e mostre o salário 
		 * a receber do funcionário de acordo com as regras a seguir:
		 * - O valor da hora trabalhada é igual a 1/5 do salário mínimo. 
		 * - O salário do mês é igual ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada. 
		 * - Para cada dependente, acrescentar R$ 32,00. 
		 * - Para cada hora extra trabalhada, calcular o valor da hora trabalhada acrescida de 50%. 
		 * - O salário bruto é igual ao salário do mês mais o valor dos dependentes mais o valor das horas extras. 
		 * - Calcular o valor do imposto de renda retido na fonte de acordo com a tabela a seguir:
		 *   IRRF        Salário Bruto
		 *   Isento      Inferior a R$ 200,00
		 *   10%         De R$ 200,00 até R$ 500,00
		 *   20%         Superior a R$ 500,00
		 * - O salário líquido é igual ao salário bruto menos IRRF.
		 * - A gratificação é de acordo com a tabela a seguir:
		 *   Salário Líquido   Gratificação
		 *   Até R$ 350,00     R$ 100,00
		 *   Superior a R$ 350,00  R$ 50,00
		 * - O salário a receber do funcionário é igual ao salário líquido mais a gratificação.
		 */
		
		        Scanner scanner = new Scanner(System.in);
		        
		        double salarioMinimo, numHorasTrabalhadas, numDependentes, numHorasExtras;
		        
		        System.out.print("Digite o valor do salário mínimo: ");
		        salarioMinimo = scanner.nextDouble();
		        System.out.print("Digite o número de horas trabalhadas: ");
		        numHorasTrabalhadas = scanner.nextDouble();
		        System.out.print("Digite o número de dependentes do funcionário: ");
		        numDependentes = scanner.nextDouble();
		        System.out.print("Digite a quantidade de horas extras trabalhadas: ");
		        numHorasExtras = scanner.nextDouble();
		        
		        double valorHoraTrabalhada = salarioMinimo / 5;
		        double salarioMes = numHorasTrabalhadas * valorHoraTrabalhada;
		        double valorDependentes = numDependentes * 32;
		        double valorHoraExtra = (valorHoraTrabalhada * 1.5) * numHorasExtras;
		        double salarioBruto = salarioMes + valorDependentes + valorHoraExtra;
		        
		        double irrf;
		        if (salarioBruto < 200) {
		            irrf = 0;
		        } else if (salarioBruto <= 500) {
		            irrf = salarioBruto * 0.1;
		        } else {
		            irrf = salarioBruto * 0.2;
		        }
		        
		        double salarioLiquido = salarioBruto - irrf;
		        
		        double gratificacao;
		        if (salarioLiquido <= 350) {
		            gratificacao = 100;
		        } else {
		            gratificacao = 50;
		        }
		        
		        double salarioReceber = salarioLiquido + gratificacao;
		        
		        System.out.println("Salário a receber do funcionário: R$" + salarioReceber);
		        
		        scanner.close();
		    }
		}

	