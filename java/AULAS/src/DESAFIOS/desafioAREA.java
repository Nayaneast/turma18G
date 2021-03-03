package DESAFIOS;

import java.util.Scanner;

public class desafioAREA {
	public static void main (String [] args) {
		//variavel 
		
		Scanner ler = new Scanner (System.in);
		Triangulo T3 = new Triangulo();
		
		double B1,H1,B2,H2,areaMaior;
		double  A1,A2;
		
		System.out.print("Digite a base do primeiro triangulo: ");
		B1 = ler.nextDouble();
		
		System.out.print("Digite o lado primeiro triangulo: ");
		H1 = ler.nextDouble();
		
		System.out.print("Digite a base do segundo triangulo: ");
		B2 = ler.nextDouble();
		
		System.out.print("Digite o lado do segundo triangulo: ");
		H2 = ler.nextDouble();
					
		System.out.print("Digite a base do terceiro triagulo: ");
		T3.base = ler.nextDouble();
		
		System.out.print("Digite o lado do terceiro triagulo: ");
		T3.altura = ler.nextDouble();
		
				
		//processamento
		
		A1=(B1*H1)/2;
		A2=(B2*H2)/2;
		
		
		System.out.printf("A área do primeiro triangulo é: %.2f\n",A1);
		System.out.printf("A área do segundo triangulo é: %.2f\n",A2);
			
		
	}
}


/*BASE * ALTURA *2 // AREA DO TRIANGULO

RECEBE DADOS DE 3 TRIANGULOS
MOSTRA A BASE, ALTURA E A AREA DE CADA TRIANGULO*/
