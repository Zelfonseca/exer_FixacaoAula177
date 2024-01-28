package entities;

import exceptions.BusinessException;

public class Account {
	//ATRIBUTOS
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	//ATRIBUTOS
	
	//CONSTRUTORES
	public Account() {
		super();
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	//CONSTRUTORES
	
	
	//GET and SET
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	// todo esse comando do SETBalance eu anulo(apago) pois assim não ocrro o risco do saldo ser manipulado
	//public void setBalance(Double balance) {
		//this.balance = balance;
	//}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	//public void setWithdrawnLimit(Double withdrawnLimit) {		o mesmo se aplica para o saque
		//this.withdrawnLimit = withdrawnLimit;
//	}
	//GET and SET
	
	
	// MÉTODOS
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		validateWithdraw(amount);
		balance = balance - amount;
	}
	
	private void validateWithdraw(double amount) {		//	método para se efetuar a regra para saque da conta
		if(amount > getWithdrawLimit()) {
			throw new BusinessException("Erro de saque: A quantia excede o limite de saque");
		}
		if(amount > getBalance()){
			throw new BusinessException("Erro de sque: Saldo insuficiente");
		}
		
	}
	
	// MÉTODOS
	

}
