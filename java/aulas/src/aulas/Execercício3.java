package aulas;

import java.util.Scanner;

public class Execerc�cio3 {

	public static void main (String args []) 
	{
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		double segundos, horas, minutos; 
	    System.out.println("Tempo de dura��o de um Evento em uma F�brica:"); 	
	    System.out.println("Entre com o Tempo em segundos:"); 
	    segundos = leia.nextDouble();
	    System.out.println("Entre com o Tempo em horas");
	    horas = leia.nextDouble(); 
	    System.out.println("Entre com o Tempo em minutos");
	    minutos = leia.nextDouble(); 
	    horas = segundos/3600;  
	    minutos = (segundos -(horas*3600))/60;
	    segundos = (segundos-(horas*3600)- (minutos*60)); 
	    
	   System.out.println("O envento ser� conclu�do em" + horas + "Horas" + minutos + "minutos" + "e" + segundos + "segundos"); 
	}
}
