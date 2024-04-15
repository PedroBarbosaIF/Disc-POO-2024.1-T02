/*9 Faça um programa que receba duas notas de seis alunos. Calcule e mostre:
■■ a média aritmética das duas notas de cada aluno; e
■■ a mensagem que está na tabela a seguir:
■■ o total de alunos aprovados;
■■ o total de alunos de exame;
■■ o total de alunos reprovados;
■■ a média da classe.Faça um programa que receba duas notas de seis alunos. Calcule e mostre:
■■ a média aritmética das duas notas de cada aluno; e
■■ a mensagem que está na tabela a seguir:*/

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int numalunos = 6;
        double[] notas1 = new double[numalunos];
        double[] notas2 = new double[numalunos];
        double[] medias = new double[numalunos];
        int totalaprovados = 0;
        int totalexame = 0;
        int totalreprovados = 0;
        double somamedias = 0;

        // Recebendo as notas dos alunos
        for (int i = 0; i < numalunos; i++) {
            System.out.println("Digite as duas notas do aluno " + (i + 1) + ":");
            notas1[i] = sc.nextDouble();
            notas2[i] = sc.nextDouble();

            // Calculando a média do aluno
            medias[i] = (notas1[i] + notas2[i]) / 2;

            // Somando as médias para calcular a média da classe
            somamedias += medias[i];

            // Verificando a situação do aluno e contando as ocorrências
            if (medias[i] >= 7) {
                totalaprovados++;
            } else if (medias[i] >= 4) {
                totalexame++;
            } else {
                totalreprovados++;
            }
        }

        // Calculando a média da classe
        double mediaClasse = somamedias / numalunos;

        // Exibindo as médias e a situação de cada aluno
        System.out.println("Médias dos alunos:");
        for (int i = 0; i < numalunos; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + medias[i]);
        }

        // Exibindo os totais e a média da classe
        System.out.println("Total de alunos aprovados: " + totalaprovados);
        System.out.println("Total de alunos de exame: " + totalexame);
        System.out.println("Total de alunos reprovados: " + totalreprovados);
        System.out.println("Média da classe: " + mediaClasse);
    }
}