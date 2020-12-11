package loja;
import java.util.Scanner;
public class CadLoja {
	public static void main(String[] args)
	{
		
		Scanner leia = new Scanner(System.in);
		String codigos[] = new String[10];
		String produtos[] = {"Shorts Rugby", "Camisetas personalizadas de ídolos", "Protetor Profissional de cabeça" ,"Bolas de Rugby Personalisadas", "Chuteiras", "Camisetas autografadas","Protetor Bucal", "Pipas personalisados com times de Rugby", "livros sobre o tema", "Chaveiros personalisados" }; 
		double precoUnitarios[] = {65,65,50,20,30,300,30,35,80,40};
		int estoque[] = new int[10];
		int escolhido = 0;
		String escolha;
		
		
		
			
		linhaDetalhe();
		System.out.println("Loja Generation");
		System.out.println("Mundando vidas, acessando conhecimento!!!");
		linhaDetalhe();
		System.out.println();
		// menu inicial
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
				System.out.printf("Seja bem-vind%s loja %s!!!\n",voltaGenero(generoCliente),nomeCliente);
				//
				System.out.println("CODIGO\t\tR$(UN)\t\tESTOQUE\tPRODUTO");
				linhaDetalhe();
				for (int x=0; x<10; x++)
				{
					estoque[x]=10;
					codigos[x]=(x<9)?"GID00"+(x+1):"GID0"+(x+1);
					System.out.printf("%s\t\t%.2f\t\t%d\t%s\n",codigos[x],precoUnitarios[x],estoque[x],produtos[x]);
											
				}
				System.out.println("Selecione pelo codigo um produto: ");
				escolha = leia.next().toUpperCase();
				for (int x=0; x<10; x++)
				{
					if (codigos[x]==escolha)
					{
						escolhido = x;
						System.out.println("Escolhido foi "+x);
					}
					
				}
				System.out.println("Produto escolhido: "+produtos[escolhido]);
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
		System.out.println("═══════════════════════════════════════════════════════");
		
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
