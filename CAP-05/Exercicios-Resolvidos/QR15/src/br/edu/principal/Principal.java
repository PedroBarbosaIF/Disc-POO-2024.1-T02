package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	
		/**
		 * Questão 15:
		 * Faça um programa que receba o preço unitário, a refrigeração (S para os produtos que necessitem de
		 * refrigeração e N para os que não necessitem) e a categoria (A — alimentação; L — limpeza; e V — 
		 * vestuário) de doze produtos, e que calcule e mostre:
		 * - O custo de estocagem, calculado de acordo com a tabela fornecida;
		 * - O imposto calculado de acordo com as regras fornecidas;
		 * - O preço final, ou seja, preço unitário mais custo de estocagem mais imposto;
		 * - A classificação calculada usando a tabela fornecida;
		 * - A média dos valores adicionais, ou seja, a média dos custos de estocagem e dos impostos dos doze 
		 * produtos;
		 * - O maior preço final;
		 * - O menor preço final;
		 * - O total dos impostos;
		 * - A quantidade de produtos com classificação barato;
		 * - A quantidade de produtos com classificação caro;
		 * - A quantidade de produtos com classificação normal.
		 */
		
		        Scanner scanner = new Scanner(System.in);
		        
		        double precoUnitario, custoEstocagem, imposto, precoFinal, mediaValoresAdicionais = 0, maiorPrecoFinal = Double.MIN_VALUE, menorPrecoFinal = Double.MAX_VALUE, totalImpostos = 0;
		        int qtdBarato = 0, qtdCaro = 0, qtdNormal = 0;
		        String refrigeracao, categoria;
		        
		        for (int i = 1; i <= 12; i++) {
		            System.out.println("Produto " + i + ":");
		            System.out.print("Digite o preço unitário: R$");
		            precoUnitario = scanner.nextDouble();
		            System.out.print("Digite a refrigeração (S/N): ");
		            refrigeracao = scanner.next().toUpperCase();
		            System.out.print("Digite a categoria (A/L/V): ");
		            categoria = scanner.next().toUpperCase();
		            
		            
		            if (precoUnitario <= 20) {
		                if (refrigeracao.equals("S")) {
		                    custoEstocagem = 2.0;
		                } else {
		                    switch (categoria) {
		                        case "A":
		                            custoEstocagem = 2.0;
		                            break;
		                        case "L":
		                            custoEstocagem = 3.0;
		                            break;
		                        case "V":
		                            custoEstocagem = 4.0;
		                            break;
		                        default:
		                            custoEstocagem = 0.0;
		                            break;
		                    }
		                }
		            } else if (precoUnitario <= 50) {
		                custoEstocagem = refrigeracao.equals("S") ? 6.0 : 0.0;
		            } else {
		                if (refrigeracao.equals("S")) {
		                    switch (categoria) {
		                        case "A":
		                            custoEstocagem = 5.0;
		                            break;
		                        case "L":
		                            custoEstocagem = 2.0;
		                            break;
		                        case "V":
		                            custoEstocagem = 4.0;
		                            break;
		                        default:
		                            custoEstocagem = 0.0;
		                            break;
		                    }
		                } else {
		                    switch (categoria) {
		                        case "A":
		                        case "V":
		                            custoEstocagem = 0.0;
		                            break;
		                        case "L":
		                            custoEstocagem = 1.0;
		                            break;
		                        default:
		                            custoEstocagem = 0.0;
		                            break;
		                    }
		                }
		            }
		            
		            
		            if (categoria.equals("A") && refrigeracao.equals("S")) {
		                imposto = precoUnitario * 0.04;
		            } else {
		                imposto = precoUnitario * 0.02;
		            }
		            
		          
		            precoFinal = precoUnitario + custoEstocagem + imposto;
		            
		           
		            mediaValoresAdicionais += custoEstocagem + imposto;
		            if (precoFinal > maiorPrecoFinal) {
		                maiorPrecoFinal = precoFinal;
		            }
		            if (precoFinal < menorPrecoFinal) {
		                menorPrecoFinal = precoFinal;
		            }
		            totalImpostos += imposto;
		            
		            
		            if (precoFinal <= 20) {
		                System.out.println("Classificação: Barato");
		                qtdBarato++;
		            } else if (precoFinal <= 100) {
		                System.out.println("Classificação: Normal");
		                qtdNormal++;
		            } else {
		                System.out.println("Classificação: Caro");
		                qtdCaro++;
		            }
		            
		            System.out.println("---------------------------");
		        }
		        
		        mediaValoresAdicionais /= 12;
		        
		        System.out.println("Média dos valores adicionais: R$" + mediaValoresAdicionais);
		        System.out.println("Maior preço final: R$" + maiorPrecoFinal);
		        System.out.println("Menor preço final: R$" + menorPrecoFinal);
		        System.out.println("Total dos impostos: R$" + totalImpostos);
		        System.out.println("Quantidade de produtos classificados como Barato: " + qtdBarato);
		        System.out.println("Quantidade de produtos classificados como Normal: " + qtdNormal);
		        System.out.println("Quantidade de produtos classificados como Caro: " + qtdCaro);
		        
		        scanner.close();
	}

}
