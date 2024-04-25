package entities;

public class BusinessAccount extends Account {
	
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer numbe, String holder, Double balance, Double loanLimit) {
		super(numbe, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount<= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
	
}
