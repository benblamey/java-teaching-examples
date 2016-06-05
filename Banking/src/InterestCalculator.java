
public class InterestCalculator {

	public void 
calculateInterest(BankAccount acc)
	{
		Double interestRate = 
				acc.getInterestRate();
// Q: Does BankAccount have a method for
//     getInterestRate()?
// A: No. its abstract.
// Q: Ah ok, whats the sub-class?
// A: SavingsAccount
// Q: Does SavingsAccount implement the method
// A: Yes
// Q: Ok, use that one.
		
		
		
		
		
		System.out
		.println("The interest rate is: "
		+ interestRate);
	}
	
}
