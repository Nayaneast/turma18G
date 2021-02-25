package LISTA1;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String [] args) {
		//3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
		//expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		
		Scanner ler = new Scanner (System.in);
				
		//variavel
		int duracao,horas=0,minutos=0, segundos=0;
		
		System.out.println("Digite a duração do evento em segundos:");
		duracao =ler.nextInt();
		
		horas=duracao/3600;
		minutos=((duracao%3600) / 60);
		segundos=((duracao%3600) % 60);
		
		System.out.println("Hora[s]: "+ horas+ " Minuto[s]: "+ minutos+ " Segundos[s]: "+ segundos);

		
	}
}
