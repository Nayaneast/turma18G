package LISTA3;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String [] args) {
		
	Scanner ler = new Scanner(System.in);
	
	//variavel
	int idade=0, total21=0, total50=0;
	

	
	while(idade != -99) {
		
		System.out.print("Digite sua idade: ");
		idade = ler.nextInt();	
		
		if ((idade>= 0) && (idade<21)) {
			total21++;
			
		}
		
		else if (idade > 50) {
			total50++;
		}
	}
	
	System.out.printf("Total de pessoas com menos de 21 anos: %d\n",total21);
	System.out.printf("Total de pessoas com mais de 50 anos: %d",total50);

		
	}
}

/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.*/