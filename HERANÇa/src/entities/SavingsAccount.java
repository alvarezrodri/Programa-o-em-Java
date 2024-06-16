package entities;


		//final - estou dizendo que essa classe savingAccount nao pode ser herdada por outra classe
public class SavingsAccount extends Account{		//conta poupança
	private Double interestRate;					//taxa de juros

	public SavingsAccount() {		//construtor padrão
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {	// os 3 primeiros sao da classe Account
		super(number, holder, balance);		//construtor da superclasse vai ser executado
		this.interestRate = interestRate;	//complemento a taxa de juros da classe SavingsAccount(Atual)
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	public void updateBalance() { //update balance é responsavel por atualizar conta com base na taxa de juros
		balance += balance * interestRate;
	}
	@Override //sobreposição -  eu transfiro um metodo da Super classe
	// se colocar o "final" no metodo da classe, ele nao deixa fazer modificação e nem chamar o metodos em outra classe
	public final void withdraw(double amount) {		//saque
		balance -= amount; 		//ela vai descontar do saldo da contaa quantia que eu que eu estou sacando, sem a taxa do valor de cima
	}

}
		
