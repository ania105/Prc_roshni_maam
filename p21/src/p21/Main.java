package p21;


class BankAccount{
	double balance;
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited: "+ amount);
		System.out.println("Current Balance: "+ balance);
	}
	
	public void withdraw(double amount) {
		balance -= amount;
		System.out.println("Withdrew: "+ amount);
		System.out.println("Current Balance: "+ balance);
	}
	
	public double getBalance() {
		return balance;
	}
}

class SavingsAccount extends BankAccount{
		double withdrawalFees;
		double withdrawalLimit;
		
		SavingsAccount(double withdrawalFees, double withdrawalLimit){
			this.withdrawalFees = withdrawalFees;
			this.withdrawalLimit = withdrawalLimit;
		}
		
		public void withdraw(double amount) {
			if(amount <= withdrawalLimit) {
				balance -= amount;
				balance -= withdrawalFees;
				System.out.println("Withdrew: " + amount);
	            System.out.println("Withdrawal fee: " + withdrawalFees);
	            System.out.println("Current balance: " + balance);
			}
			else {
				System.out.println("Withdrawal Limit exceeded.");
			}
		}
}

class CheckingAccount extends BankAccount{
		double overdraftLimit;
		
		CheckingAccount(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
		public void withdraw(double amount) {
	        if (amount <= overdraftLimit) {
	            balance -= amount;
	            System.out.println("Withdrew: " + amount);
	            System.out.println("Current balance: " + balance);
	        } else {
	            System.out.println("Overdraft limit exceeded.");
	        }
	    }
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount savingsAccount = new SavingsAccount(5, 1000);
        CheckingAccount checkingAccount = new CheckingAccount(500);
        savingsAccount.deposit(2000);
        savingsAccount.withdraw(500);
        System.out.println();
        checkingAccount.deposit(1000);
        checkingAccount.withdraw(600);
        checkingAccount.withdraw(700);
	}

}
