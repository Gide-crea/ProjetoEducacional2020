package aulas;


public class lacoderepeticaoExcercício2 {

	
	public  static  void  main ( String [] args )
	{   int x, y = 0 ;

	   for (x = 1 ; x <=  500 ; x ++ )
	       { if ((x %  3 ) == 0  && (x % 2 ) != 0 );
	       {
	    	y = y + x;   
	       }

	       }
	   System.out.println(" a soma dos numeros multiplos de 3 e impares é; " + y); 


	}


	}