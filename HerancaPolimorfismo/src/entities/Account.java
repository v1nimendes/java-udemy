package entities;

public class Account {
	
	private Integer numbe;
	private String holder;
	protected Double balance;
	
	public Account() {
		
	}
	
	public Account(Integer numbe, String holder, Double balance) {
		this.numbe = numbe;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumbe() {
		return numbe;
	}

	public void setNumbe(Integer numbe) {
		this.numbe = numbe;
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

	public void withdraw(double amount) {
		balance -=amount + 5.0;
	}
	
	public void deposit(double amount) {
		balance +=amount;
	}


}
