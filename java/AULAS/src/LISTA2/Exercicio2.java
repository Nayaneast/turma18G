package LISTA2;

import java.util.*;

public class Exercicio2 {
	
	public static void main(String [] args) {
	//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
	
	Scanner ler = new Scanner (System.in);
	
	int n1, n2, n3; 
		
	System.out.print("Digite o 1� n�mero: ");
	n1=ler.nextInt();
	
	System.out.print("Digite o 2� n�mero: ");
	n2=ler.nextInt();

	System.out.print("Digite o 3� n�mero: ");
	n3=ler.nextInt();
	
	if(n1 <= n2 && n2 <= n3) {
		
		System.out.print("A ordem crescente:"+n1+" "+n2+" 7"+n3);
	}
	
	else if (n1 <= n3 && n3 <= n2){
		System.out.printf("A ordem crescente: %d %d %d\n", n1, n3, n2);
	  }
	else if (n2 <= n1 && n1 <= n3){
	    System.out.printf("A ordem crescente: %d %d %d\n", n2, n1, n3);
	  }
	else if (n2 <= n3 && n3 <= n1){
		 System.out.printf("A ordem crescente: %d %d %d\n", n2, n3, n1);
	  }
	else if (n3 <= n1 && n1 <= n2){
		 System.out.printf("A ordem crescente: %d %d %d\n", n3, n1, n2);
	  }
	else {
		 System.out.printf("A ordem crescente: %d %d %d\n", n3, n2, n1);
	  }
	
	
	
	}
}

