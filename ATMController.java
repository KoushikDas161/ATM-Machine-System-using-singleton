
public class ATMController {
  
	private static ATMController instance = new ATMController();
	private ATMController() {
		System.out.println("ATM initialized");
	}
	public static ATMController getInstance() {
		if(instance == null) {
			instance = new ATMController();
		}
		return instance;
	}
	
	double balance = 10000;

	
	public void withdraw(double amount) {
		System.out.println("Withdraw " + amount);
		balance-=amount;
	}
	
	public void deposit(double amount) {
		System.out.println("Deposite " + amount);
		balance+=amount;
	}
	
	public void checkBalance() {
		System.out.println("Final Balance " + balance);
	}
	
}
