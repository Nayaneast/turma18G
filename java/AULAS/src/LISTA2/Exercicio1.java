package LISTA2;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String [] args) {
		//Faça um programa que receba três inteiros e diga qual deles é o maior.
		
		Scanner ler = new Scanner(System.in);
		
		//variavel 
		int n1,n2,n3,maior;
		System.out.print("Digite o primeiro número: ");
		n1=ler.nextInt();
		
		System.out.print("Digite o segundo número: ");
		n2=ler.nextInt();
		
		System.out.print("Digite o terceiro número: ");
		n3=ler.nextInt();	
				
		if(n1>n2&n1>n3) {
			System.out.printf("O maior número é: %d",n1);
		}
		if(n2>n1&n2>n3) {
			System.out.printf("O maior número é: %d",n2);
		}
		else if(n3>n1&n3>n2) {
			System.out.printf("O maior número é: %d",n3);
		}
		
		
		
	}
}
