programa
{
	
	
	
	funcao inicio()
	{
		cadeia nomeA
		inteiro matA, cieA, artA, portA, mediaA
		
		cadeia nomeB
		inteiro matB, cieB, artB, portB, mediaB
		
		cadeia nomeC
		inteiro matC, cieC, artC, portC, mediaC
		
		cadeia nomeD
		inteiro matD, cieD, artD, portD, mediaD

		
				escreva("Digite o nome do aluno: ")
			leia (nomeA)
			escreva("Digite a nota de Português (De 1 a 10): ")
			leia(portA)
			escreva("Digite a nota de Matematica (De 1 a 10): ")
			leia(matA)
			escreva("Digite a nota de Ciências (De 1 a 10): ")
			leia(cieA)
			escreva("Digite a nota de Artes (De 1 a 10): ")
			leia(artA)
			escreva("\n")

			mediaA=(portA+matA+cieA+artA)/4

				escreva("Digite o nome do aluno: ")
			leia (nomeB)
			escreva("Digite a nota de Português (De 1 a 10): ")
			leia(portB)
			escreva("Digite a nota de Matematica (De 1 a 10): ")
			leia(matB)
			escreva("Digite a nota de Ciências (De 1 a 10): ")
			leia(cieB)
			escreva("Digite a nota de Artes (De 1 a 10): ")
			leia(artB)
			escreva("\n")

			
			mediaB=(portB+matB+cieB+artB)/4

				escreva("Digite o nome do aluno: ")
			leia (nomeC)
			escreva("Digite a nota de Português (De 1 a 10): ")
			leia(portC)
			escreva("Digite a nota de Matematica (De 1 a 10): ")
			leia(matC)
			escreva("Digite a nota de Ciências (De 1 a 10): ")
			leia(cieC)
			escreva("Digite a nota de Artes (De 1 a 10): ")
			leia(artC)
			escreva("\n")
			
			mediaC=(portC+matC+cieC+artC)/4

				escreva("Digite o nome do aluno: ")
			leia (nomeD)
			escreva("Digite a nota de Português (De 1 a 10): ")
			leia(portD)
			escreva("Digite a nota de Matematica (De 1 a 10): ")
			leia(matD)
			escreva("Digite a nota de Ciências (De 1 a 10): ")
			leia(cieD)
			escreva("Digite a nota de Artes (De 1 a 10): ")
			leia(artD)
			escreva("\n")
			
			mediaD=(portD+matD+cieD+artD)/4
			  
		
		limpa()

		se(mediaA>5){
			escreva (nomeA," Português: ", portA," Matematica: ",matA," Ciência: ",cieA," Artes: ",artA, " Média: ",mediaA, "- Ok pode continuar!")
		}
		senao{
			escreva (nomeA," Português: ", portA," Matematica: ",matA," Ciência: ",cieA," Artes: ",artA, " Média: ",mediaA, "- precisa estudar mais!\n")
		}
		

		
	}

	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2158; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */