class Account {
	private int regNumber;
	private String name;
	private int balance;
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getBalance() {
		return balance;
	}
	void setBalance(int balance) {
		this.balance = balance;
	}
}
public class AccountTest {

	public static void main(String[] args) {
		Account obj = new Account();
		obj.setName("Tom");
		obj.setBalance(10000);
		System.out.println("이름은 " + obj.getName() + " 통장 잔고는 " + obj.getBalance() + "입니다.");
	}

}
