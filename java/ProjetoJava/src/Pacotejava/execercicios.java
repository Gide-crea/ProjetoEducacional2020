package Pacotejava;

import java.util.Scanner;

public class execercicios {

    public static void main(String[] args) 
    {
    	
    	Scanner leia = new Scanner(System.in);  
    	
    	double valorCelsius; 
    	double valorFahrenheit;
    	System.out.println("\nDigite a temperatura em Fahrenheit:");
    	valorFahrenheit = leia.nextDouble(); 
    
        valorCelsius = (valorFahrenheit - 32)/ 1.8;
    
    System.out.println("\nA temperatura em Celsius é:"+(Math.round(valorCelsius)));
        
        
    
    }
    
}    









