package entities;

public abstract class TaxPayer {
	private String name;
	private double anuallIncome; // rendimento anual da pessoa ou da empresa
	
	public TaxPayer() {
		
	}

	public TaxPayer(String name, double anuallIncome) {
		this.name = name;
		this.anuallIncome = anuallIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAnuallIncome() {
		return anuallIncome;
	}

	public void setAnuallIncome(double anuallIncome) {
		this.anuallIncome = anuallIncome;
	}
	public abstract Double tax(); 

}
