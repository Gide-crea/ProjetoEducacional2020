package aulas;

import java.util.Scanner;

public class Exerc�cio1 {         
     
	public static void main ( String args []) {
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		int ano; //=365 
		int mes; //=12
		int dia; //=30
		int tempoAnos;
		 System.out.println("Digite quantos anos de idade voc� tem:"); 
	     ano= leia.nextInt();
	     System.out.println("Digite o m�s do seu nascimento"); 
	     mes = leia.nextInt(); 
	     System.out.println("Digite o dia do seu anivers�rio"); 
	     dia = leia.nextInt(); 
	     
	     tempoAnos = (ano * 365) + (mes * 30) + dia; 
	      
	  System.out.println("At� aqui guerreiro(a), voc� viveu:"+ tempoAnos +  "\ndias.");
	     
	}


}
