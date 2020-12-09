package aulas;

import java.util.Scanner;

public class Condicionalisexcercício8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		 int numero; 
         System.out.println("Entre com um número inteiro:"); 
         numero = leia.nextInt();
         
         if (numero>100) {
        	  
        	  System.out.println(numero);
         
         }
         else if (numero <100) 
         {
             System.out.println(numero=0);        	 
         }
         
	}     
	    
	   

}
