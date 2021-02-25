package LISTA1;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String [] args) {
		
		//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
		//dias e mostre-a expressa apenas em dias.
		
		Scanner ler = new Scanner (System.in);
		
		//variavel 
		int idadeAnos,idadeMeses,idadeDias,idade;
        
        System.out.println("Digite sua idade: "); 
        idadeAnos=ler.nextInt();
        
        System.out.println("Digite quantos meses se passaram desde do seu aniversário:");
        idadeMeses=ler.nextInt();
        
        System.out.println("Quantos dias se passaram desde o seu aniversário até hoje:");
        idadeDias=ler.nextInt();
        
        //processamento        
        idade=(idadeAnos*365)+(idadeMeses*30)+idadeDias;
        
        //saida
        System.out.println("A idade em dias é:" + idade);
      		
	}
}

