package Pacotejava;

import java.util.Scanner;

public class ClasseeExcercício1 {

    public static void main(String args[])
    {
   
    	
          Scanner leia = new Scanner(System.in); // instanciar o teclado
          String nome;
          int ano; 
          int dia;
          int mes;
          int tempoAnos;
          System.out.println("Qual seu respectivo nome?");
          nome= leia.next();
          System.out.println("Digite o ano do seu nascimento:");
          ano= leia.nextInt();
          System.out.println("Digite o mês do seu nascimento:");
          mes= leia.nextInt();
          System.out.println("Digite o dia do seu nascimento:");
          dia=leia.nextInt();
          tempoAnos=(ano*365)+(mes*30)+dia;
          
          
          tempoAnos = (ano * 365)+ (mes*30)+ dia; 
          
          System.out.println("Você viveu em dias + total dias+");
                   
    
    
    }

}

