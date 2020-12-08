package aulas;

import java.util.Scanner;

public class Exercício1 {         
     
	public static void main ( String args []) {
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		int ano; //=365 
		int mes; //=12
		int dia; //=30
		int tempoAnos;
		 System.out.println("Digite quantos anos de idade você tem:"); 
	     ano= leia.nextInt();
	     System.out.println("Digite o mês do seu nascimento"); 
	     mes = leia.nextInt(); 
	     System.out.println("Digite o dia do seu aniversário"); 
	     dia = leia.nextInt(); 
	     
	     tempoAnos = (ano * 365) + (mes * 30) + dia; 
	      
	  System.out.println("Até aqui guerreiro(a), você viveu:"+ tempoAnos +  "\ndias.");
	     
	}


}
