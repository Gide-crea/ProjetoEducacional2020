package aulas;

import java.util.Scanner;

public class enquantoexcerc�cio1 {

	public  static  void  main ( String [] args )
	{
           
		   Scanner leia = new Scanner (System.in); 
	     
		   double numero = 0.00, soma = 0.00 , media = 0.00; 
		   float total = 0;
		   
		   while (numero >=0)
		   { 
			   System.out.println("Digite aqui valores n�mericos:");
			   numero = leia.nextDouble(); 
			   if (numero > 0)
			   {
				  
				   soma = soma + numero;
				   total = total + 1; 
			   }
	 		  
   		   }
	    	
		   media = soma / total; 
		   System.out.println("A soma dos n�meros atenuados �: " + soma + "."); 
		   System.out.println("A soma dos n�meros atenuados �: " + media + ".");
		   System.out.println("O total de n�meros b�sicos �: " + soma + "."); 
	}
}	
