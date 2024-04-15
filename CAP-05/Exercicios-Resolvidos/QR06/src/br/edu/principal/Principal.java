/*6. Uma empresa possui dez funcionários com as seguintes características: código, número de horas traba-
lhadas no mês, turno de trabalho (M — matutino; V — vespertino; ou N — noturno), categoria (O —

operário; ou G — gerente), valor da hora trabalhada. Sabendo-se que essa empresa deseja informatizar
sua folha de pagamento, faça um programa que:*/

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double cont, codigo, nht, valor, sal_min, sal_inicial, aux, sal_final;
		String turno = "true";
		String categoria = "true";
		
		sal_min = 450;
		nht=0;
		valor=0;
		codigo=0;
		
		
		for (cont=1; cont<=10; cont++)
		{
		System.out.println("Digite o código: ");
		codigo = sc.nextDouble();
		System.out.println ("Digite o número de horas trabalhadas: ");
		nht = sc.nextDouble();
		System.out.println ("Digite o seu turno (M, V, O): ");
		turno = sc.next();
		System.out.println ("Digite a sua categoria (G ou O): ");
		categoria = sc.next();
		
		
		 while (turno != "M" && turno != "V" && turno != "N")
	      {
	        System.out.println (turno);
	      }
	    while (categoria != "O" && categoria != "G")
	      {
	        System.out.println (categoria);
	      }
	    if (categoria == "G");
	    {
	      if (turno == "N") {
	        valor = sal_min*18/100;}
	      else
	        valor = sal_min*15/100;
	    }
	    if (turno == "N") {
	      valor = sal_min*13/100;}
	    else
	      valor = sal_min*10/100;
	  }
	sal_inicial = valor*nht;
	  if (sal_inicial <= 300) {
	    aux = sal_inicial*20/100;}
	  else if (sal_inicial<600);{
	     aux = sal_inicial*15/100;}
	  else
	     aux = sal_inicial*5/100;
	  
	  	sal_final = sal_inicial + aux;
	  	System.out.println (codigo +  sal_final);
	} 
	  }