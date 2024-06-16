package entities;

public abstract class Account {				//Classe bastrata
	
	private Integer number;			
	private String holder;			//private define que ele pode ser acessado somente pela propria classe
	protected Double balance;		//protected	- para o meu atributo "balance" seja acessado por outra classe e nao seja publico
	
	public Account() {				//sobrecarga
		
	}

	public Account(Integer number, String holder, Double balance) {			//construtor da super classe
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

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

	public void withdraw(double amount) {		//saque
		balance -= amount + 5.0;
	}
	public void deposit(double amount) {		//deposito
		balance += amount;
	}
}
