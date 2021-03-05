package CADFUNCIONARIO;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;


public class TesteFuncio {

	public static void main(String[] args) {
		
		/*Funcionario colaborador = new Funcionario("Carlos", 122, 10, 15.25);
		Terceiro colaborador1 = new Terceiro ("Joana",342,10,15.25,50);
		
		
		System.out.println("Salario do "+colaborador.getNome()+ " é R$ "+colaborador.salario());
		
		System.out.println("Salario do "+colaborador1.getNome()+ " é R$ "+colaborador1.salario());*/
		
		Scanner  ler = new Scanner(System.in);
		
		List <Funcionario> lista = new ArrayList<>();
		
		System.out.println("Digite a quantidade de func na lista: ");
		int quantidade = ler.nextInt();
		
		for(int x=1; x<= quantidade; x++)
		{
			System.out.println("Funcionario"+x);
			System.out.println("1 - Funcionario ou 2-Terceiro: ");
			char tipo =ler.next().charAt(0);
			
			
			
		}
		
		
		
	}

}
