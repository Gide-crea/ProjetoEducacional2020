package CursoEmVideo2020;

import java.util.Scanner;

public class NomeSalario {

	   public static void main(String[] args) 
	{
	   Scanner leia = new Scanner (System.in); 
		
	    String nome; 
	    double salario; 
	   System.out.println("Qual o respectivo nome do funcion�rio:");
	   nome = leia.next(); 
	   System.out.println("Sal�rio:"); 
	   salario = leia.nextDouble();  
	   
	   System.out.println("O(a) funcionario(a) " + nome + " tem um sal�rio de "  + salario + " em Junho.");
       
	}

}
