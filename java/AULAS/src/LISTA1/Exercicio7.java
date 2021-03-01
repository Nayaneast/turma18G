package LISTA1;
	
	import java.util.*;
	
public class Exercicio7 {
	
	public static void main(String [] args){
		
		Scanner scan =new Scanner(System.in);
		
		// variavel
		double a,b,c,d,e,f,x,y;
		
		//entrada
		
		System.out.print("Digite o coeficiente a: ");
		a=scan.nextDouble();
		
		System.out.print("Digite o coeficiente b: ");
		b=scan.nextDouble();
		
		System.out.print("Digite o coeficiente c: ");
		c=scan.nextDouble();
		
		System.out.print("Digite o coeficiente d: ");
		d=scan.nextDouble();
		
		System.out.print("Digite o coeficiente e: ");
		e=scan.nextDouble();
		
		System.out.print("Digite o coeficiente f: ");
		f=scan.nextDouble();
		
		//processamento
		
		x=((c*e)-(b*f))/((a*e)-(b*d));
		
		y=((a*f)-(c*d))/((a*e)-(b*d));
		
		//saida
		
		System.out.printf("\nO valor de x é %.2f e o valor de y é %.2f.",x,y);

		
	}
	
}

/*
Um sistema de equações lineares do tipo: 
	ax + by = c
	dx + ey = f
pode ser resolvido segundo mostrado abaixo:
	x = (ce - bf) / (ae - bd)
	y = (af - cd) / (ee - bd)
Escreva um sistema que lê os coeficientes a,b,c,d,e, f 
e calcula e mostra os valores de x e y.

*/