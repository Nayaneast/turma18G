package LISTA4;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in); 
		ContaBancaria conta1 = new ContaBancaria(1380,"223.435.993-00",true);
		int conta=0;
		double valor;
		char opcao;
		
		System.out.print("Digite o n° da sua conta: ");
		conta = ler.nextInt();
		
		if (conta==conta1.getNumero()) {
			System.out.println("Acesso permitido\n");
		}
		else {
			System.out.print("Acesso negado");
		}
		
		while(conta!=conta1.getNumero());
		
		System.out.print("Digite o valor:");
        valor = ler.nextDouble();
        System.out.print("Debito ou Credito? D/C:\n");
        opcao = ler.next().toUpperCase().charAt(0);
        	
        if (opcao =='D'){
            conta1.debito(valor);
        }
       
        else if (opcao =='C') {

            conta1.credito(valor);
        }
        
        else{
            System.out.println("Opção invalida!!!");
        }
        
        System.out.println("Saldo atual: "+conta1.getSaldo());	
			
				
	}

}

