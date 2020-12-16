package CursoEmVideo2020;

import java.util.Scanner;

public class NumerosIntSoma {

	public static void main(String[] args) {
		
	  Scanner ler = new Scanner(System.in); 
	  
	  int N1, N2, Soma; 
	  System.out.println("Digite um valor:");
	  N1 = ler.nextInt(); 
	  System.out.println("Digite outro valor:");
	  N2 = ler.nextInt(); 
	  
	  Soma = (N1 + N2); 
	  
	  System.out.println("A soma entre "  + N1 + " e " + N2 + " é igual a " + Soma);
	  
	  

	}

}
