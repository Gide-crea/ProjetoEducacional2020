package CursoEmVideo2020;

import java.util.Scanner;

public class IntAntecessoreSucessor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); 
		
		int N1, Antecessor, Sucessor; 
		System.out.println("Entre com um número inteiro:");
		N1 = leia.nextInt();  
	
	    Antecessor = N1 - 1; 
	    Sucessor = N1 + 1;
	    
	    System.out.println("O antecessor de " + N1 + " é " + Antecessor );
	    System.out.println("O sucessor de " + N1 + " é " + Sucessor);   
	}
}
