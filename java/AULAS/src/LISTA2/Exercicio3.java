package LISTA2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
		//categoria ela se encontra: 10-14 infantil / 15-17 juvenil/18-25 adulto
		
		Scanner ler = new Scanner(System.in);
		
		//variavel
		int idade;
		
		System.out.print("Digite sua idade:");
		idade=ler.nextInt();
		
		if(idade>=10 && idade<=14){
			System.out.printf("Voc� tem: %d anos, sua categoria � Infantil.",idade);
		}
		
		else if(idade>=15 && idade<=17){
			System.out.printf("\n Voc� tem:"+ idade +"anos, sua categoria � Juvenil.");
		}
		
		else if(idade>=18 && idade<=25){
			System.out.printf("\nVoc� tem: %d anos, sua categoria � Adulto.",idade);
		}
		else {
			System.out.println("N�o possui categoria dispon�vel!");
		}
		
		
		System.out.println("\nObrigada :)");
		
				
		
	}

}
