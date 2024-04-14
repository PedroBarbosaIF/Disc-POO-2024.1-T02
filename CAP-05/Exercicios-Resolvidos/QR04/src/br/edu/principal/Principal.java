//4. Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes de trânsito.
//Foram obtidos os seguintes dados:
//a) código da cidade;
//b) número de veículos de passeio;
//c) número de acidentes de trânsito com vítimas.
//Deseja-se saber:
//a) qual é o maior e qual é o menor índice de acidentes de trânsito e a que cidades pertencem;
//b) qual é a média de veículos nas cinco cidades juntas;
//c) qual é a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.

package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int cont, cod, num_vei, num_acid;
        int maior = 0, cid_maior = 0;
        int menor = 0, cid_menor = 0;
        double media_vei, soma_vei = 0, media_acid;
        int soma_acid = 0, cont_acid = 0;

        for (cont = 1; cont <= 5; cont++) {
            System.out.println("Cidade " + cont + ":");
            System.out.print("Digite o código da cidade: ");
            cod = scanner.nextInt();

            System.out.print("Digite o número de veículos de passeio: ");
            num_vei = scanner.nextInt();

            System.out.print("Digite o número de acidentes de trânsito com vítimas: ");
            num_acid = scanner.nextInt();

            if (cont == 1) {
                maior = num_acid;
                cid_maior = cod;
                menor = num_acid;
                cid_menor = cod;
            } else {
                if (num_acid > maior) {
                    maior = num_acid;
                    cid_maior = cod;
                }
                if (num_acid < menor) {
                    menor = num_acid;
                    cid_menor = cod;
                }
            }

            soma_vei += num_vei;

            if (num_vei < 2000) {
                soma_acid += num_acid;
                cont_acid++;
            }
        }
        for (int i = 0; i < 30; i++) {
            System.out.print("=");
        }
        System.out.println("Maior índice de acidentes: " + maior + ", pertence à cidade de código " + cid_maior);
        System.out.println("Menor índice de acidentes: " + menor + ", pertence à cidade de código " + cid_menor);
        
        media_vei = soma_vei / 5;
        System.out.println("Média de veículos nas cinco cidades: " + media_vei);

        if (cont_acid == 0) {
            System.out.println("Não foi digitada nenhuma cidade com menos de 2000 veículos");
        } else {
            media_acid = soma_acid / (double) cont_acid;
            System.out.println("Média de acidentes de trânsito nas cidades com menos de 2000 veículos de passeio: " + media_acid);
        }

        scanner.close();

	}

}
