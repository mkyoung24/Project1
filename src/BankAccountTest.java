class BankAccount {
	int accountnumber;
	String owner;
	int balance;
	
	void deposit(int amount) {
		balance += amount;
	}
	
	void withdraw(int amount) {
		balance -= amount;
	}
	
	public String toString() {
		return "���� �ܾ��� " + balance + "�Դϴ�.";
	}
}
public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount();
		
		myAccount.deposit(10000);
		System.out.println(myAccount);
		myAccount.withdraw(3000);
		System.out.println(myAccount);

	}

}
