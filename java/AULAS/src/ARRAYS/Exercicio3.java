package ARRAYS;

import java.util.Random;

public class Exercicio3 {
	public static void main(String [] args) {
		
		//variavel 
		
		int N1 [] []= new int [4] [6];
		int N2 [] []= new int [4] [6];
		int M1 [] []= new int [4] [6];
		int M2 [] []= new int [4] [6];
			
		Random valores = new Random();
		
		
		final int LINHA=4, COLUNA=6;
		
		int l=0, c=0 ;
		
		for(l=0; l<LINHA; l++) {
			for(c=0;c<COLUNA; c++) {
				//System.out.printf("Informe o valor da linha %d e da coluna %d ", l+1, c+1);
				
				N1[l][c] = valores.nextInt(9)+1;				
				N2[l][c] = valores.nextInt(9)+1;	
				M1[l][c] = N1[l][c] + N2[l][c];
				
				
			}
			
		}
		
		System.out.println("Dados de N1:");
		
			for (l=0; l<LINHA; l++) {
				for (c=0;c<COLUNA; c++) {
					System.out.print(N1[l][c]+" ");
				}
			}

		

		
		
	}
	
}

/*3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.*/
