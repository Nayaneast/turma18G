package LISTA2;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String [] args) {
		//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		Scanner ler = new Scanner(System.in);
		
		//variavel 
		int n1,n2,n3,maior;
		System.out.print("Digite o primeiro n�mero: ");
		n1=ler.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		n2=ler.nextInt();
		
		System.out.print("Digite o terceiro n�mero: ");
		n3=ler.nextInt();	
				
		if(n1>n2&n1>n3) {
			System.out.printf("O maior n�mero �: %d",n1);
		}
		if(n2>n1&n2>n3) {
			System.out.printf("O maior n�mero �: %d",n2);
		}
		else if(n3>n1&n3>n2) {
			System.out.printf("O maior n�mero �: %d",n3);
		}
		
		
		
	}
}
