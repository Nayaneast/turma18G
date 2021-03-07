package Banco;

import java.util.Random;
import java.util.Scanner;

public class TesteEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random aleatorio = new Random();
		Scanner entradaDados = new Scanner(System.in);

		int opcao;
		int valor = 0;
		char opcaoPerfil;
		
		String cpf;
		int numero;
		int aniversarioPoupanca;
		double emprestimo;
		
		do {
			System.out.println("Ola, seja bem vindo ao Connect Banck.");
			System.out.println("Encurtando distancias entre seus objetivos.");
			System.out.println("O que voce gostaria de fazer hoje?");
			
			System.out.println();
			
			System.out.println("1 | CONTA POUPANCA");
			System.out.println("2 | CONTA CORRENTE");
			System.out.println("3 | CONTA ESPECIAL");
			System.out.println("4 | CONTA EMPRESA");
			System.out.println("5 | CONTA ESTUDANTIL");
			System.out.println("0 | SAIR");
			
			System.out.print("==> "); 
			opcao = entradaDados.next().charAt(0);
			entradaDados.nextLine();
			
			switch(opcao) {
			
					
				case '4':
					/* ======================= */
					/* PERFIL | CONTA EMPRESA  */
					/* ======================= */
					
					System.out.println("PERFIL | CONTA EMPRESA");
					System.out.println();
					
					System.out.println("Cadastro: ");
					System.out.print("CPF: ");
					cpf = entradaDados.nextLine();
					
					numero = aleatorio.nextInt((999999 - 111111) + 1) + 111111;
					emprestimo = 10000;
					
					/* ================================== */
					/* INSTANCIA A CLASSE - CONTA EMPRESA */
					/* ================================== */
					
					ContaEmpresa co = new ContaEmpresa(numero, cpf, emprestimo);
					
					opcaoPerfil = '0';
					valor = 0;
					co.setContarMovimentacao(0);
					
					/* ====================== */
					/* MENU | PERFIL DE CONTA */
					/* ====================== */
					
					System.out.println("Ola, seja bem vindo ao BBBank - G5");
					System.out.println("Bom, Bonito e Barato.");
					
					System.out.println();
					System.out.println("Seja Bem-Vindo a sua Conta Empresa");
					System.out.println("Numero Conta: "+ co.getNumero());
					
					do {
						System.out.println("1 | VERIFICAR SALDO");
						System.out.println("2 | VERIFICAR DADOS CADASTRAIS");
						System.out.println("3 | SOLICITAR EMPRESTIMO");
						System.out.println("4 | CREDITAR");
						System.out.println("5 | DEBITAR");
						System.out.println("0 | LOGOUT");
						
						System.out.print("==> "); 
						opcaoPerfil = entradaDados.next().charAt(0);
						entradaDados.nextLine();
						
						switch(opcaoPerfil) {
							case '1':
								System.out.println("MENU | VERIFICAR SALDO");
								System.out.println();
								
								System.out.println("Saldo Conta: "+ co.getSaldo());
								System.out.println();
							break;
							
							case '2':
								System.out.println("MENU | MEU DADOS");
								System.out.println();
								
								System.out.println("Conta: "+ co.getNumero());
								System.out.println("CPF: "+ co.getCpf());
								System.out.println("Saldo Conta: "+ co.getSaldo());
								System.out.println("Emprestimo: "+ co.getEmprestimo());
								System.out.println();
							break;
							
							case '3':
								System.out.println("MENU | MEU EMPRESTIMO");
								System.out.println();
								
								co.mostrarsaldo();
								co.pegaremprestimo();
								
								System.out.println();
							break;
							
							case '4':
								System.out.println("MENU | CREDITAR");
								System.out.println();
								
								System.out.println("Quanto voce deseja depositar? ");
								System.out.print("R$ ");
								valor = entradaDados.nextInt();
								
								/* ========================= */
								/* CREDITA UM VALOR NA CONTA */
								/* ========================= */
								
								co.credito(valor);
								
								co.gravarMovimentacaoCredito(co.getContarMovimentacao(), co.getSaldo(), valor);
								
								co.setContarMovimentacao(co.getContarMovimentacao() + 1);
								
								System.out.println();
							break;
							
							case '5':
								System.out.println("MENU | DEBITAR");
								System.out.println();
								
								System.out.println("Quanto voce deseja sacar? ");
								System.out.print("R$ ");
								valor = entradaDados.nextInt();
								
								/* ======================== */
								/* DEBITA UM VALOR NA CONTA */
								/* ======================== */
								
								co.debito(valor);
								
								System.out.println();
							break;
							
							case '0':
								System.out.println("LOGOUT");
								System.out.println();
							break;
							
							default:
								System.out.println("Opcao invalida, tente novamente!");
								System.out.println();
							break;
						}
						
						if(co.getContarMovimentacao() == co.getMovimento().length) {
							opcaoPerfil = '0';
							
							System.out.println("-----------------------------------------------");
							System.out.println("Voce realizou o maximo de movimentacoes do dia!");
							System.out.println("-----------------------------------------------");
							System.out.println();
							
						}
						
					}while(opcaoPerfil != '0');
					
					co.listarMovimentacoesConta();
					
				break;
									
			}
			
		}while(opcao != '0');
	}

}
