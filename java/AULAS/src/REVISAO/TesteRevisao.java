package REVISAO;

import java.util.Scanner;

public class TesteRevisao{

	public static void main(String[] args) {
		
		
		//Usuario fa�a alguma coisa  
		Scanner ler = new Scanner(System.in);//objeto - ler
		String nome;
		int anoNascimento;
		char genero;
		
		System.out.println();
		nome = ler.next();
		Pessoa amigo = new Pessoa(nome);
		
		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = ler.nextInt();
		
		System.out.println("Digite M-masculino, F-feminino ou O-outros: ");
		genero = ler.next().toUpperCase().charAt(0);
		
		Pessoa cliente = new Pessoa(nome, anoNascimento,genero);//instaciar criar teclado no programa
		
		System.out.println("O nome da amizade �: "+amigo.getNome());
		
		System.out.println("O nome do cliente �: "+cliente.getNome()+ "e o ano de nascimento � :"+cliente.getAnoNascimento());

		
		
		//teste (Jeito programador/ eu defino os dados)
		//Pessoa amigo = new Pessoa("Osvaldo"); // Objeto - amigo 
		//Pessoa cliete = new Pessoa("Maria"); // Objeto - cliente  


		if(cliente.idade() >= 18 ) {
			System.out.println("Cliente � adulto");
		}
		else {
			System.out.println("Cliente menor de idade");
			System.out.println("E a iddae �"+cliente.idade());
		}
		
	}

}
