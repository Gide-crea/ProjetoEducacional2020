package aulas;

import java.util.Scanner;

public class Excercício5 {

	public static void main (String arg []) 
	{
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		double nota1, nota2, nota3; 
		double media, mediaponderada;  
		System.out.println("ler primeira nota do aluno:");
		nota1 = leia.nextDouble(); 
		System.out.println("ler segunda nota do aluno:");
		nota2= leia.nextDouble(); 
		System.out.println("ler terceira nota do aluno");
		nota3 = leia.nextDouble(); 
		
		
	     media = ((nota1*2) + (nota2*3) + (nota3*5));
		 mediaponderada = media/10; 
		
 	System.out.println((mediaponderada));  
	}


}

