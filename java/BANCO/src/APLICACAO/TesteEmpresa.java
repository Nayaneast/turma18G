package APLICACAO;

import java.util.InputMismatchException;
import java.util.Scanner;

import CLASSES.ContaEmpresa;

public class TesteEmpresa {
	  public static void main(String [] args) {
		
		  ContaEmpresa minhaconta = new ContaEmpresa();
	      Scanner ler = new Scanner(System.in);
	     
	      int op;
	      double valor;
	     
	      
	      
	     
	      
	      
	      do {
	    	  
	    	  //for(int x=0; op>=1; x++) {
		     /* System.out.println("\nBem-Vindo ao BBBank");
		      System.out.println("----- * Menu * > CONTA EMPRESA ---- -");
	          System.out.println("1- SALDO");
	          System.out.println("2- SAQUE");//debito
	          System.out.println("3- DEPOSITO");//credito
	          System.out.println("4- EMPRESTIMO");
	          System.out.println("0- SAIR --------");
	          op = ler.nextInt();*/
	          
	          try {
	        	  System.out.println("\nBem-Vindo ao BBBank");
	   		      System.out.println("----- * Menu * > CONTA EMPRESA ---- -");
	   	          System.out.println("1- SALDO");
	   	          System.out.println("2- SAQUE");//debito
	   	          System.out.println("3- DEPOSITO");//credito
	   	          System.out.println("4- EMPRESTIMO");
	   	          System.out.println("0- SAIR --------");
	   	          op = ler.nextInt();
		            System.out.println();
		            } catch (InputMismatchException e) {
		            	System.out.println("Você digitou uma letra ao invés de número!");
		            }
   	           op = ler.nextInt();

	          
	          switch(op) {
	          
	          case 1 : 
	        	  minhaconta.mostrarsaldo();
	        	  
	          break;
	        	  
	          case 2 :
	        	  minhaconta.mostrarsaldo();
	        	  System.out.print("Digite o valor de saque: ");
	        	  valor = ler.nextDouble();
	        	  minhaconta.debito(valor);
	        	  
	          break;
	        	  
	          case 3 :
	        	  System.out.print("Digite o valor a ser depositado: ");
	        	  valor = 	ler.nextDouble();
	        	  minhaconta.credito(valor);
	        	  
	          break;	  
	          
	          case 4 :
	        	  minhaconta.mostrarsaldo();
	        	  minhaconta.pegaremprestimo();
	          break;
	          
	              
	          }

	          
	          
	          
	  //   }
	      }while(op != 0);
		  
	      
	  }
}
