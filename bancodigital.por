programa
{
	
	funcao inicio()
	{
		const inteiro numeroConta = 2020
		const cadeia numeroCPF = "000.111.222-4"
		const inteiro N=10
		real movimentacao [N]
		real saldoConta = 0.0//Reais
		inteiro opcao, opcao2
		real emprestimo =0.0,debito=0.0
		
		
		escreva ("\n------------------------------------------------------\n")
		escreva("         Seja Bem vindo ao seu Banco Digital G&4")
		escreva ("\n------------------------------------------------------\n")
		
		escreva("CONFIRME SEUS DADOS: ")
		escreva("\n")
		escreva("-------------------------")
		escreva("\nNúmero da Conta: ", numeroConta)
		escreva("\nNúmero do CPF: ", numeroCPF)
		escreva("\nSeu saldo é: ", saldoConta)
		escreva("\n-------------------------")
		
		para (inteiro x = 0; x < N; x++){
			escreva("\n1-Débito ou 2-crédito:")
		 	leia(opcao)
		 	se (opcao == 1)
		 	{
                	escreva("Escreva o valor de Débito:")
                  	leia (debito)
		 	
		 	  	 se(saldoConta >=debito)
		 	  	 {
		 	  		 movimentacao[x] =(saldoConta - debito)
		 	  	 }
		 	      senao
		 	      {
		 	     	escreva("Saldo insuficiente!!")
		 	     	escreva("Deseja solicitação de empréstimo?[1] - Sim ou [2] - Não")	
		 	 		leia(opcao2)
		 	 		se(opcao2 == 1)
		 	 		{
                       		escreva("Qual o valor desejado do empréstimo?:")
                      		leia(emprestimo)
                       		saldoConta = (saldoConta + emprestimo)
                		     movimentacao[x] =(saldoConta - debito)
		 	     	}
		 	    		senao se (opcao2 == 2)
		 	     	{	 	 
		 	          escreva("Tenha um ótimo dia!!:")
			 	    	}
		 			
		 		}
		 	}
		 	senao se (opcao == 2){
		 		escreva("Digite o valor de crédito que deseja:")
		 	 
		 	}
		    
 	    } 	 
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1734; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */