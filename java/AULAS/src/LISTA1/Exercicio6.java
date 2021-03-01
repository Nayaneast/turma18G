package LISTA1;

import java.util.Scanner;
import java.math.*;

public class Exercicio6 {
	public static void main (String [] args){
	
	Scanner ler = new Scanner (System.in);
	
	//variavel
	double x1,x2,y1,y2,d;
	
	
	//entrada 
	
	System.out.print("Digite o x1: ");
	x1 = ler.nextDouble();
	
	System.out.print("Digite o y1: ");
	y1 = ler.nextDouble();
	
	System.out.print("Digite o x2: ");
	x2 = ler.nextDouble();
	
	System.out.print("Digite o y2: ");
	y2 = ler.nextDouble();
	 
	//processamento
	
	d = (Math.sqrt(Math.pow(x2-x1, 2))+(Math.pow(y2-y1, 2)));
	
	//d=raiz (x2-x1)² + (y2-y1)²
	
	//saida
	System.out.print("A distancia entre os pontos é: "+d);
	
			
	}
}

/*Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula */