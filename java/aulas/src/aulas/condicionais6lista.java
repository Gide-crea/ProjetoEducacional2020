package aulas;

import java.util.Scanner;

public class condicionais6lista {
    
	public static void main (String args[])
    {
    	
		Scanner leia = new Scanner(System.in); 
    	int idade; 
    	System.out.println("Entre com a idade do nadador:");     	
    	idade = leia.nextInt(); 
    	
    	if (idade>=18)
    	{
          
       		System.out.println("O respectivo nadador é um ser adulto!!!"); 
    	}
           	
        else if (idade>0 && idade<=4)
    	{
    		
    		System.out.println("O respectivo dado não classifica no sistema!!");
    	}
    	
    	else if (idade > 5 && idade<=7)
    	{
    		
    		System.out.println("O respectivo nadador é um ser Infantil A:"); 
    	}
    	
    	else if (idade>8 && idade<=11)
    	{
    	    System.out.println("O respectivo nadador é um ser Infantil B!!"); 	
    	}   
    	
    	else if (idade>12 && idade<=13)
    	{
    		System.out.println("O respectivo nadador é um ser Juvenil A!!");
    		
    	}
    	else if (idade>14 && idade<=17)
    	{
    	   
    		System.out.println("O respectivo nadador é um ser Juvenil B!!");
    	}
      
 }
}