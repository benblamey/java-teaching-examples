
public  class BankAccount {
	
	public BankAccount(Double initAmt) {
		
		_balance = (double) initAmt;
	}
	
	private double _balance;
	
	public double getBalance() {
		return _balance;
	}
	
	public void withdraw(Double amt) {
		_balance = _balance - amt;
	}

	private Double _interestRate;

	public Double getInterestRate(){
		return _interestRate;
	}
	
	public void setInterestRate(Double rate) {
		_interestRate = rate;
	}
}
