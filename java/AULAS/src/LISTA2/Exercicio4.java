package LISTA2;

import java.util.Scanner;
import java.math.*;

public class Exercicio4 {
	public static void main(String [] args) {
		
		Scanner scan =new Scanner(System.in);
		
		//Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
		//n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
		//�mpar exiba o n�mero elevado ao quadrado.
		
		int num;
		
		System.out.println("Digite um n�mero: ");
		num=scan.nextInt();
		
		if (num%2==0) {
			
			
			System.out.printf("O n�mero %d � par e sua raiz quadrada �:"+(Math.sqrt(num)),num);
		}
		
		else {
			System.out.printf("O n�mero %d � impar e o n�mero elevado �: "+(Math.pow(num,2)),num);
		}
		
	}
}
