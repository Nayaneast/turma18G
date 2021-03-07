package CLASSES;

import java.util.Scanner;

public class ContaEmpresa extends Conta {

	//Atributos 
	private double emprestimo = 10000;
	private double valorEmprestimo=0;
	private int op;
	private char opcao;
	
	Scanner ler = new Scanner(System.in); 
	
	//Construtores
	public ContaEmpresa(int numero, String cpf, double emprestimo, double valorEmprestimo) {
		super(numero, cpf);
		this.emprestimo = emprestimo;
		this.valorEmprestimo = valorEmprestimo;
	}
	public ContaEmpresa() {
		
	}
	
	
	//Encapsulamento

	public double getEmprestimo() {
		return emprestimo;
	}


	public void setEmprestimo(double emprestimo) {
		this.emprestimo = emprestimo;
	}


	public double getValorEmprestimo() {
		return valorEmprestimo;
	}


	public void setValorEmprestimo(double valorEmprestimo) {
		this.valorEmprestimo = valorEmprestimo;
	}


	public int getOp() {
		return op;
	}


	public void setOp(int op) {
		this.op = op;
	}


	public void mostrarsaldo() {
		System.out.println("Saldo atual R$ "+this.getSaldo());
	}
	
	
	@Override
	public void credito(double valor) {
		this.saldo = this.saldo+valor;
		
		System.out.println("---------------------------------");
		System.out.println("\nDeposito realizado com sucesso.");
		System.out.printf("\nSaldo atual R$ %.2f \n",this.getSaldo());
		
		System.out.println("---------------------------------");
		
		

		
	}	
	
	@Override
	public void debito(double valor) {
		if (this.saldo >= valor) {
			
			this.saldo = this.saldo - valor;
			
			System.out.println("---------------------------------");
			System.out.println("\nSaque realizado com sucesso.");
			System.out.printf("\nSaldo atual R$ %.2f ", this.getSaldo());
			System.out.println("\n---------------------------------");
			
			
			
		}
		
		else if (this.saldo <= valor ) {
			
			this.pegaremprestimo();
		}
		
		else {
			System.out.println("\nTransação Negada");
		}
	}

	
	public void pegaremprestimo() {
		if (this.saldo >= 0 ) {
			
			System.out.printf("\nVocê tem R$ %.2f dísponivel para emprestimo.",emprestimo);
			
				System.out.println("\nDeseja pegar valor de emprestimo Sim [S] ou Não [N]:  ");
				
				opcao = ler.next().toUpperCase().charAt(0);
				
				if (opcao =='S'){
						
					
						if (this.getEmprestimo() <=0 ) {
							System.out.println("TRANSAÇÃO NEGADA.");
						}// como  parar o processo e voltar para o menu
						
						else {
						System.out.print("\nDigite o valor que deseja de emprestimo: ");
						valorEmprestimo = ler.nextDouble();
					
						
			        	this.setEmprestimo(this.getEmprestimo()-valorEmprestimo);
			        	
			        	this.saldo = this.saldo+valorEmprestimo;
			        	
						System.out.println("\nEmprestimo realizado com sucesso.");
			        	System.out.printf("\nSaldo atual : R$ %.2f ", this.getSaldo());
			        	/*Aparece esse saldo ?*/System.out.printf("\nEmprestimo saldo: R$ %.2f ",emprestimo);
			        	System.out.println();
			        	//preciso devolver o valor para o saldo de emprestimo
						}
			        }
			       
			        else if (opcao =='N') {

			        	System.out.println("Obrigado por utilizar nossos serviços!");
			        }				
				
		}
		
		
		
		

	}
}
