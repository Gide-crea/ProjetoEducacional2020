package loja;
import java.util.Scanner;

public class Cadloja {
	
	public static void main(String[] args)
	{
		
		Scanner leia = new Scanner(System.in);
		
		Scanner leia = new Scanner(System.in);
		String codigos[] = new String[10];
		String produtos[] = {"Shorts Rugby", "Camisetas personalizadas de ídolos", "Protetor Profissional de cabeça" ,"Bolas de Rugby Personalisadas", "Chuteiras", "Camisetas autografadas","Protetor Bucal", "Pipas personalisados com times de Rugby", "livros sobre o tema", "Chaveiros personalisados" };
		double precoUnitarios[] = {30,200,25,65,100,300,25,10,40,40};
		int estoque[] = new int[10];
			
		linhaDetalhe();
		System.out.println("RUGBY Tackcle");
		System.out.println("SEU MUNDO OVAL NA PALMA DA SUA MÃO");
		linhaDetalhe();
		System.out.println();
		
		System.out.println("[1] - COMPRAR PRODUTOS");
		System.out.println("[2] - GERENCIAR ESTOQUE");
		System.out.println("[3] - SAIR");
		System.out.println();
		System.out.print("DIGITE A OPÇÃO: ");
		char opcaoMenu = leia.next().charAt(0);
		switch (opcaoMenu)
		{
			case '1':
			{
				System.out.print("Por favor informe o seu nome: ");
				String nomeCliente = leia.next().toUpperCase();
				System.out.print("Você de define como M-masculino, F-feminino ou O-outro :");
				char generoCliente = leia.next().toUpperCase().charAt(0);
				System.out.printf("Seja bem-vind%s a loja %s!!!",voltaGenero(generoCliente),nomeCliente);
							
				break;
				
			}
			case '2':
			{
				System.out.println("WIP");  // work in progress
				break;
			}
			case '3':
			{
				System.out.println("Volte sempre, adoramos sua visita!!!");
				break;
			}
				
		}
		
		
	}
	
	
	public static void linhaDetalhe() {
		System.out.println("----------------------------------------------------");
		
	}
	
	public static String voltaGenero(char generoCliente) {
		
		String tipo;
		if (generoCliente == 'M')
		{
			tipo = "o";
		}
		else if (generoCliente == 'F')
		{
			tipo = "a";
		}
		else if (generoCliente == 'O')
		{
			tipo = "x";
		}
		else
		{
			tipo = "*";
		}
			
		
		return tipo;
	  }
	
}

