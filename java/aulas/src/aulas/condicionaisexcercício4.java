package aulas;

import java.util.Scanner;

public class condicionaisexcercício4 {

	public static void main(String[] args) {
		
		 Scanner leia = new Scanner(System.in);
          
		 int N; 
		 
		 System.out.println("Digite um número inteiro:"); 
		 N = leia.nextInt(); 
		 
        if ( N > 0)
        {
          System.out.println(" O respectivo número digitado é positvo.");
          
        }
        else if (N < 0) 
        {
        	
        	System.out.println("O respectivo número digitado é negativo.");
        }
        
        if ( N % 2 == 0)
        {
        	System.out.println("O respectivo número é par");
        }
	    else if (N % 2 !=0)
       {
           System.out.println("O respectivo número é impar"); 	
	   }

}   }
