package LISTA2;

import java.util.Scanner;
import java.math.*;

public class Exercicio4 {
	public static void main(String [] args) {
		
		Scanner scan =new Scanner(System.in);
		
		//Faça um programa em que permita a entrada de um número qualquer e exiba se este
		//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
		//ímpar exiba o número elevado ao quadrado.
		
		int num;
		
		System.out.println("Digite um número: ");
		num=scan.nextInt();
		
		if (num%2==0) {
			
			
			System.out.printf("O número %d é par e sua raiz quadrada é:"+(Math.sqrt(num)),num);
		}
		
		else {
			System.out.printf("O número %d é impar e o número elevado é: "+(Math.pow(num,2)),num);
		}
		
	}
}
