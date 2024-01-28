package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.BusinessException;

public class Program {

	public static void main(String[] args) {
		
/* Fazer um programa para ler os dados de uma conta bancária e depois realizar um saque nesta conta bancária, mostrando o novo saldo. 
   Um saque não pode ocorrer ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de saque da conta. 
   Conforme projeto da aula 177 
*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//==============================================dados da conta===========================================
		System.out.println("Informe os dados da conta.");
		System.out.print("Número: ");
		int number = sc.nextInt();
		System.out.print("Titular: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Saldo inicial: R$ ");
		double balance = sc.nextDouble();
		System.out.print("Limite de saque: R$ ");
		double withdrawLimit = sc.nextDouble();
		//==============================================dados da conta===========================================
		//Como já informei todos os dados da conta para serem inseridos, irei instanciar o OBJETO CONTA abaixo
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.print("Informe uma quantia para sacar: R$ ");
		double amount = sc.nextDouble();
		
		
		try {
			acc.withdraw(amount);					 // assim que insiro o valor a ser sacado da conta, eu chamo o método de saque da classe ACCOUNT
			System.out.printf("Novo Saldo: R$ %.2f" , acc.getBalance()); 
		}
		catch(BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		
		//NESTA TERCEIRA VERSÃO FOI CRIADA UMA CLASSE PARA ARMAZENAR AS EXCESSÕES PARA SEREM LANÇADAS QUANDO HOUVER ERROS EM INSERIR OS DADOS.
		
		// SENDO MAIS FÁCIL PARA A MANUTENÇÃO E DEIXANDO A CODIFICAÇÃO MAIS LIMPA
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}
