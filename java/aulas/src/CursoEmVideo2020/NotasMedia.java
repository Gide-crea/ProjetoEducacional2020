package CursoEmVideo2020;

import java.util.Scanner;

public class NotasMedia {

	public static void main(String[] args) {
		Scanner PT = new Scanner(System.in); 
		
        double N1, N2; 
        double media; 
        
        System.out.println("Insira primeira nota:");
        N1 = PT.nextDouble();  
        System.out.println("Insira segunda nota:"); 
        N2 = PT.nextDouble(); 
        
        media = ((N1 + N2)/2);
        
        System.out.println("A média entre " + N1 + " e " + N2 + " é igual a " + media ); 
	}

}
