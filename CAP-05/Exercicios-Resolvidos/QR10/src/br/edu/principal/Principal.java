/*10. Em um campeonato de futebol existem cinco times e cada um possui onze jogadores. Faça um progra-
ma que receba a idade, o peso e a altura de cada um dos jogadores, calcule e mostre:

- a quantidade de jogadores com idade inferior a 18 anos;
-- a média das idades dos jogadores de cada time;
-- a média das alturas de todos os jogadores do campeonato; e
-- a porcentagem de jogadores com mais de 80 kg entre todos os jogadores do campeonato.*/

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numtimes = 5;
		int numjogadores = 11;
		
		
		 int totalJogadores = numtimes * numjogadores;
	        int jogmenor18 = 0;
	        int totalidades = 0;
	        double totalalturas = 0;
	        int jogmais80kg = 0;
		
		int[] idades = new int[totalJogadores];
        double[] pesos = new double[totalJogadores];
        double[] alturas = new double[totalJogadores];
        
        for (int i = 0; i < totalJogadores; i++) {
            System.out.println("Digite a idade do jogador " + (i + 1) + ":");
            idades[i] = scanner.nextInt();
            System.out.println("Digite o peso do jogador " + (i + 1) + ":");
            pesos[i] = scanner.nextDouble();
            System.out.println("Digite a altura do jogador " + (i + 1) + ":");
            alturas[i] = scanner.nextDouble();
        
            if (idades[i]<18) {
            	jogmenor18++;
            }
            
            totalidades += idades[i];
            totalalturas += alturas[i];
            
            if (pesos[i] > 80) {
            	jogmais80kg++;
            }
        }
            
            double mediaIdades = (double) totalidades / totalJogadores;
            double mediaAlturas = totalalturas / totalJogadores;
            double porcentagemMais80kg = (double) jogmais80kg / totalJogadores * 100;
            
            System.out.println("Quantidade de jogadores com idade inferior a 18 anos: " + jogmenor18);
            System.out.println("Média das idades dos jogadores: " + mediaIdades);
            System.out.println("Média das alturas dos jogadores: " + mediaAlturas);
            System.out.println("Porcentagem de jogadores com mais de 80kg: " + porcentagemMais80kg + "%");
	}
	}
