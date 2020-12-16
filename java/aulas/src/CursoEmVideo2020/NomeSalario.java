package CursoEmVideo2020;

import java.util.Scanner;

public class NomeSalario {

	   public static void main(String[] args) 
	{
	   Scanner leia = new Scanner (System.in); 
		
	    String nome; 
	    double salario; 
	   System.out.println("Qual o respectivo nome do funcionário:");
	   nome = leia.next(); 
	   System.out.println("Salário:"); 
	   salario = leia.nextDouble();  
	   
	   System.out.println("O(a) funcionario(a) " + nome + " tem um salário de "  + salario + " em Junho.");
       
	}

}
