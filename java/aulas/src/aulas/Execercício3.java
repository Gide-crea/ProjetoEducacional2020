package aulas;

import java.util.Scanner;

public class Execercício3 {

	public static void main (String args []) 
	{
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		double segundos, horas, minutos; 
	    System.out.println("Tempo de duração de um Evento em uma Fábrica:"); 	
	    System.out.println("Entre com o Tempo em segundos:"); 
	    segundos = leia.nextDouble();
	    System.out.println("Entre com o Tempo em horas");
	    horas = leia.nextDouble(); 
	    System.out.println("Entre com o Tempo em minutos");
	    minutos = leia.nextDouble(); 
	    horas = segundos/3600;  
	    minutos = (segundos -(horas*3600))/60;
	    segundos = (segundos-(horas*3600)- (minutos*60)); 
	    
	   System.out.println("O envento será concluído em" + horas + "Horas" + minutos + "minutos" + "e" + segundos + "segundos"); 
	}
}
