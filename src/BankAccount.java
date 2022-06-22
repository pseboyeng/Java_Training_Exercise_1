
/**
 * 
 * @author peter seboyeng
 *
 */
class BankAccount {

	private String firstName;
	private String lastName;
	private double balance;
	private int age;
	private String pin;
	private String accNum;
	
	
	public BankAccount() {
		this("default","default",0);
	}

	public BankAccount(String name, String surname, int age) {
		this.firstName = name;
		this.lastName = surname;
		this.age = age;
		this.balance = 0.00;
		this.pin = generateNewPassword();
		this.accNum = generateNewPassword();
	}
	/**
	 * 
	 * @param amount
	 */
	public void depositFunds(double amount) {
		if (amount <= 0) {
			System.out.println("You can't deposit R 0.00");
		} else {
			this.setBalance(this.getBalance() + amount);
			System.out.println(
					"Account Notification : R " + amount + " deposited in account number " + this.getAccountNumber());
			System.out.println("New balance : R " + this.getBalance());
		}
	}

	/**
	 * 
	 * @param amount
	 */
	public void withdraw(double amount) {
		if (amount > this.getBalance()) {
			System.out.println("Insufficient funds. Available balance : R " + this.getBalance()
					+ ". Requested amount : R " + amount);
		} else {
			this.setBalance(this.getBalance() - amount);
			System.out.println("Account notification. R " + amount + " withdrawn. Available balance : R " + this.getBalance());
		}
	}
	
	/**
	 * 
	 * @return firstName
	 */
	public String getName() {
		return this.firstName;
	}
	
	/**
	 * 
	 * @return lastName
	 */

	public String getSurname() {
		return this.lastName;
	}
	
	/**
	 * 
	 * @return balance
	 */

	public double getBalance() {
		return this.balance;
	}
	
	/**
	 * 
	 * @return age
	 */

	public int getAge() {
		return this.age;
	}
	
	/**
	 * 
	 * @return account number
	 */

	public String getAccountNumber() {
		return this.accNum;
	}
	
	/**
	 * 
	 * @return password
	 */

	public String getPassword() {
		return this.pin;
	}
	
	/**
	 * 
	 * @param name
	 */

	public void setName(String name) {
		this.firstName = name;
	}
	/**
	 * 
	 * @param surname
	 */

	public void setSurname(String surname) {
		this.lastName = surname;
	}
	
	/**
	 * 
	 * @param amount
	 */

	private void setBalance(double amount) {
		this.balance = amount;
	}
	
	/**
	 * 
	 * @param age
	 */

	public void setAge(byte age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "BankAccount [firstName=" + firstName + ", lastName=" + lastName + ", balance=" + balance + ", age="
				+ age + ", pin=" + pin + ", accNum=" + accNum + "]";
	}
	
	/**
	 * 
	 * @return password
	 */
	
	public String generateNewPassword() {
		String password = "";
		
		for(int i=0; i<9;i++) {
			int rand = (int)Math.floor(Math.random() * (30-1 + 1) + 1);
			password+=rand;
		}
		
		return password;
	}
	
	

}