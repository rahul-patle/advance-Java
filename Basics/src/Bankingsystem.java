
public class Bankingsystem {


int Account=50000;
int balance=1000;
static String bankname;
	public Bankingsystem(int account, int balance) {
		super();
		Account = account;
		this.balance = balance;
	}
	public Bankingsystem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAccount() {
		return Account;
	}
	public void setAccount(int account) {
		Account = account;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public static String getBankname() {
		return bankname;
	}
	public static void setBankname(String bankname) {
		Bankingsystem.bankname = bankname;
	}
	@Override
	public String toString() {
		return "Bankingsystem [Account=" + Account + ", balance=" + balance + "]";
	}
	
}
