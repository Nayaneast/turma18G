package ARRAYS;

import java.util.Random;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		
		int lancamento [] = new int [10];
		int maiorPontuacao=0, contador=0;
		double mediaAri = 0.00, soma=0.00;
		Random dado = new Random(); // chamar - criar
		
		/*for (int x=0; x<lancamento.length; x++) {
				System.out.printf("Digite o resultado do %d� lancamento :",(x+1));
				lancamento[x] = dado.nextInt(6)+1;

			}*/

			for (int x=0; x<lancamento.length; x++) {
				System.out.printf("O valor do lancamento %d � %d \n", (x+1), lancamento[x]);
				soma = soma+lancamento[x];
				if (lancamento[x] >= maiorPontuacao) {

					if (lancamento[x] > maiorPontuacao ) {
						contador = 0;
					}
					maiorPontuacao = lancamento[x]; 
					contador++;
				}
			}
			
			//processamento
			mediaAri = soma / lancamento.length;

			//saidas
			System.out.printf("Total dos lancamentos digitados: %.0f \n", soma);
			System.out.printf("A m�dia � %.2f \n",mediaAri);
			System.out.printf("O maior valor � %d \n", maiorPontuacao);
			System.out.printf("O maior valor aparece %d vez(es)\n",contador );

	}

}

/* 2. Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.*/
