package LISTA1;

import java.util.Scanner;
import java.math.*;

public class Exercicio4 {
	public static void main(String [] args) {
		//Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
		//calcule a seguinte expressão:

		Scanner ler = new Scanner (System.in);
		
		int A,B,C;
		double d,R,S;

		System.out.println("Digite A: ");
		A=ler.nextInt();
		System.out.println("Digite B: ");
		B=ler.nextInt();
		System.out.println("Digite C: ");
		C=ler.nextInt();


		R=(Math.pow((A+B),2));
		S=(Math.pow ((B+C),2));
		d=(R+S)/2;
		
		System.out.println(" O resultado de D é "+ d);
		

		
	}

}
