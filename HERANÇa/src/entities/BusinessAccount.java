package entities;

public class BusinessAccount extends Account{ //a minha classe BusinessAccount vai ter todos os dados e 
												//comportamento da minha classe Account, isso se chama subclasse
											//ou seja BussinessAcount é uma subclasse

	private Double loanLimit;
	
	
	public BusinessAccount() {		//sobrecarga
		super();
	}


	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);		//construtor da super classe
		this.loanLimit = loanLimit;
	}


	public Double getLoanLimit() {
		return loanLimit;
	}


	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {				//loan - emprestimo
		if(amount <= loanLimit) {
			balance += amount - 10;
		}
	}
		@Override 									//sobreposição -  eu transfiro um metodo da Super classe
		public void withdraw(double amount) {		//saque
			super.withdraw(amount);					//reutilizei o codigo, que está na superclasse
			balance -= 2.0;
	}
}
