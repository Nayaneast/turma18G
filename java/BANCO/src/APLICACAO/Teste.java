package APLICACAO;

import java.util.Scanner;

import CLASSES.Conta;
import CLASSES.ContaEmpresa;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		//Conta conta1 = new Conta(1, "111.111.111-11");
		//Conta conta2 = new Conta(2);
		Conta conta3 = new Conta(3, "222.222.222-22", true);
		ContaEmpresa clienteEmpresa = new ContaEmpresa(1456,"222.342.111-33",10.000);
		
		int numero;
		double valor;
		char opcao;
		
		
		
		//conta3.credito(100);
		//conta3.debito(34);
		

		System.out.println("Olá, Bem-Vindo ao Banco Generation");
		System.out.println("---- Menu ---- ");
		System.out.println("1 - Conta P ");
		System.out.println("2 - Conta Corrente");
		System.out.println("3 - Conta Especial");
		System.out.println("4 - Conta Empresa");
		System.out.println("0 - Conta Estudantil");
		char tipo = ler.next().toUpperCase().charAt(0); 
		
		if(tipo == '4') {
			System.out.println("Digite o numero da conta: ");
			
		}
		
		ContaEmpresa clienteEmpresa1 = new ContaEmpresa(1439,"222.222.222-22", 10000.00);

	System.out.println("Digite o valor:");
	        valor = ler.nextDouble();
    System.out.println("Debito ou Credito? D/C:");
	        opcao = ler.next().toUpperCase().charAt(0);
	        	
	        if (opcao =='D'){
	        	clienteEmpresa.debito(valor);
	        }
	       
	        else if (opcao =='C') {

	        	clienteEmpresa.credito(valor);
	        }
	        
	        else{
	            System.out.println("Opção invalida!!!");
	        }
	        
	        System.out.println("Saldo atual: "+clienteEmpresa.getSaldo());	
	        System.out.println("Saldo atual: "+clienteEmpresa.getEmprestimo());	

	}

}
