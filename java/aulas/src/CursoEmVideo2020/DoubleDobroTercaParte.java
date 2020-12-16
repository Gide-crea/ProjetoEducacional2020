package CursoEmVideo2020;

import java.util.Scanner;

public class DoubleDobroTercaParte {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); 
		
       double N1, Dobro, TercaParte; 
       System.out.println("Entre com um número:"); 
       N1 = leia.nextDouble(); 
       
       Dobro = (N1 * 2);
       TercaParte = (N1/3); 
       
       System.out.println("O dobro de " + N1 + " é " + Dobro);
	   System.out.println("A terça parte de " + N1 + " é " + TercaParte);
	}

}
