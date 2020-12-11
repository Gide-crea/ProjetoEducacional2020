package aulas;

public class vetoreseMatrizExcercício2 {


	 public static void main(String[] args) {
	        int lancamentos [] = new int [10];
	        int x, repetir = 0;
	        double media = 0.0;
	        double numero=0;

	        for(x = 0; x < 10; x++){
	            numero = Math.random() * 10; //Importei a biblioteca Util para sortear um número entre 1 e 10 
	            System.out.println("\nNumero sorteado: " + Math.round(numero));
	            media = (numero + numero)/2    ;

	        }

	            System.out.println("\nMédia: " + Math.round(media));
	            System.out.println("O maior valor foi: "+ numero);
	    

	}




}
