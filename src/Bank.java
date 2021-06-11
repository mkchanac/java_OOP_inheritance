
public class Bank {
		private int accountNumber;
		private double balance;
		private String customerName;
		private String email;
		private int phoneNumber;
		
		public int getAccountNumber() {
			return this.accountNumber;
		}
		public double getBalance() {
			return this.balance;
		}
		public String getCustomerName() {
			return this.customerName;
		}
		public String getEmail() {
			return this.email;
		}
		public int getPhoneNumber() {
			return this.phoneNumber;
		}
		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public void getCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public void getEmail(String email) {
			this.email = email;
		}
		public void getPhoneNumber(int phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		public void depositFunds(double deposit) {
			this.balance += deposit;
			System.out.println("Your bank balance is: $" + this.balance);
		}
		
		public void withdrawFunds(double withdraw) {
			if (withdraw>this.balance)
				System.out.println("You bank account balance is not enough");
			else
				this.balance -= withdraw;
			
			System.out.println("Your bank balance is: $" + this.balance);
		}
		
}
