package aulas;

import java.util.Scanner;

public class CondicionaisExercício3 {

  public static void main (String [] args)
   {
	   Scanner leia = new Scanner(System.in);
	  
	  double n1, n2, n3, n4; 
	   double quadrado1, quadrado2, quadrado3, quadrado4; 
	   
	   System.out.println("Entre com o número 1:");
	   n1 = leia.nextDouble(); 
	   System.out.println("Entre com o número 2:");
	   n2 = leia.nextDouble(); 
	   System.out.println("Entre com o número 3:");
	   n3 = leia.nextDouble();
	   System.out.println("Entre com o número 4:");
	   n4 = leia.nextDouble(); 
   
       quadrado1 = n1*n1; 
	   quadrado2 = n2*n2; 
	   quadrado3= n3*n3; 
	   quadrado4 = n4*n4; 
	   
	   if (quadrado3 >=1000)
	   {
		   System.out.println(quadrado3);
		   
		   
	   }
	   else 
	   {
		   System.out.println(quadrado1);
		   System.out.println(quadrado2);
		   System.out.println(quadrado3);
		   System.out.println(quadrado4);
	   
	   }
	   
	   
	   
	   
   }



}
