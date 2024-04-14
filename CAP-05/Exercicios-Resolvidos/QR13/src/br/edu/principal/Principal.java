package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		/**
		 * Questão 13:
		 * Foi feita uma pesquisa para determinar o índice de mortalidade infantil em certo período. Faça um
		 * programa que:
		 * - Leia o número de crianças nascidas no período;
		 * - Identifique o sexo (M ou F) e o tempo de vida de cada criança nascida.
		 * O programa deve calcular e mostrar:
		 * - A percentagem de crianças do sexo feminino mortas no período;
		 * - A percentagem de crianças do sexo masculino mortas no período;
		 * - A percentagem de crianças que viveram 24 meses ou menos no período.
		 */
	
		        Scanner scanner = new Scanner(System.in);
		        
		        int numCriancasNascidas, numCriancasMortasFeminino = 0, numCriancasMortasMasculino = 0, numCriancasMenor24Meses = 0;
		        char sexo;
		        int tempoVida;
		        
		        System.out.print("Digite o número de crianças nascidas no período: ");
		        numCriancasNascidas = scanner.nextInt();
		        
		        for (int i = 0; i < numCriancasNascidas; i++) {
		            System.out.print("Digite o sexo da criança (M ou F): ");
		            sexo = scanner.next().charAt(0);
		            System.out.print("Digite o tempo de vida da criança em meses: ");
		            tempoVida = scanner.nextInt();
		            
		            if (sexo == 'F') {
		                numCriancasMortasFeminino++;
		            } else {
		                numCriancasMortasMasculino++;
		            }
		            
		            if (tempoVida <= 24) {
		                numCriancasMenor24Meses++;
		            }
		        }
		        
		        double percentagemMortasFeminino = (double) numCriancasMortasFeminino / numCriancasNascidas * 100;
		        double percentagemMortasMasculino = (double) numCriancasMortasMasculino / numCriancasNascidas * 100;
		        double percentagemMenor24Meses = (double) numCriancasMenor24Meses / numCriancasNascidas * 100;
		        
		        System.out.println("Percentagem de crianças do sexo feminino mortas no período: " + percentagemMortasFeminino + "%");
		        System.out.println("Percentagem de crianças do sexo masculino mortas no período: " + percentagemMortasMasculino + "%");
		        System.out.println("Percentagem de crianças que viveram 24 meses ou menos no período: " + percentagemMenor24Meses + "%");
		        
		        scanner.close();

	}

}
