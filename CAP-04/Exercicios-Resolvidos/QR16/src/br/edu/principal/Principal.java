package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	
		/**
		 * Questão 16:
		 * Um supermercado deseja reajustar os preços de seus produtos usando o seguinte critério: o produto
		 * poderá ter seu preço aumentado ou diminuído. Para o preço ser alterado, o produto deve preencher 
		 * pelo menos um dos requisitos a seguir:
		 * Venda Média Mensal   Preço Atual   % de Aumento   % de Diminuição
		 * < 500                < R$ 30,00     10             –
		 * >= 500 e < 1.200     >= R$ 30,00 e < R$ 80,00     15             –
		 * >= 1.200             >= R$ 80,00                  –               20
		 * Faça um programa que receba o preço atual e a venda média mensal do produto, calcule e mostre o 
		 * novo preço.
		 */
		
		        Scanner scanner = new Scanner(System.in);
		        
		        double precoAtual, vendaMediaMensal, novoPreco;
		        
		        System.out.print("Digite o preço atual do produto: R$");
		        precoAtual = scanner.nextDouble();
		        System.out.print("Digite a venda média mensal do produto: ");
		        vendaMediaMensal = scanner.nextDouble();
		        
		        if (vendaMediaMensal < 500 || precoAtual < 30) {
		            novoPreco = precoAtual * 1.1; // Aumento de 10%
		        } else if ((vendaMediaMensal >= 500 && vendaMediaMensal < 1200) && (precoAtual >= 30 && precoAtual < 80)) {
		            novoPreco = precoAtual * 1.15; // Aumento de 15%
		        } else if (vendaMediaMensal >= 1200 && precoAtual >= 80) {
		            novoPreco = precoAtual * 1.2; // Aumento de 20%
		        } else {
		            novoPreco = precoAtual; // Não houve reajuste
		        }
		        
		        System.out.println("Novo preço do produto: R$" + novoPreco);
		        
		        scanner.close();

	}

}
