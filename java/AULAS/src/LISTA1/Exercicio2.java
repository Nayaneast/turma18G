package LISTA1;

import java.util.Scanner;

public class Exercicio2 {
	//Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.
	public static void main(String [] args){
	
	Scanner ler = new Scanner (System.in);
	//variaveis
	int idade;
	int idadeAnos=0,idadeMeses=0,idadeDias=0;
	
	System.out.println("Digite sua idade em dias:");
	idade=ler.nextInt();
	
	
	idadeAnos=idade/365;
	idadeMeses=((idade%365) / 30);
	idadeDias=((idade%365) % 30);
	
	System.out.println("Idade "+ idadeAnos+ " Anos,"+ idadeMeses+ " Meses e "+idadeDias+ " Dias ");
	
	}

}
