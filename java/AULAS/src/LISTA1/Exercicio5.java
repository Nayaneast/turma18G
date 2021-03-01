package LISTA1;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String [] args) {
		// receber 3 notas
		// media ponderada peso 2,3,5
		
		Scanner ler = new Scanner(System.in);
		
		float nota1,nota2,nota3, media;
	
		
		System.out.print("Digite a primeira nota: ");
		nota1=ler.nextInt();
		
		System.out.print("Digite a segunda nota: ");
		nota2=ler.nextInt();
		
		System.out.print("Digite a terceira nota: ");
		nota3=ler.nextInt();
		
		media=((nota1*2)+(nota2*3)+(nota3*5))/(2+3+5);
				
		System.out.printf("A média é :%f",media);
				
	}
	
}