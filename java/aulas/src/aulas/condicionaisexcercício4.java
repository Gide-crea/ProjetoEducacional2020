package aulas;

import java.util.Scanner;

public class condicionaisexcerc�cio4 {

	public static void main(String[] args) {
		
		 Scanner leia = new Scanner(System.in);
          
		 int N; 
		 
		 System.out.println("Digite um n�mero inteiro:"); 
		 N = leia.nextInt(); 
		 
        if ( N > 0)
        {
          System.out.println(" O respectivo n�mero digitado � positvo.");
          
        }
        else if (N < 0) 
        {
        	
        	System.out.println("O respectivo n�mero digitado � negativo.");
        }
        
        if ( N % 2 == 0)
        {
        	System.out.println("O respectivo n�mero � par");
        }
	    else if (N % 2 !=0)
       {
           System.out.println("O respectivo n�mero � impar"); 	
	   }

}   }
