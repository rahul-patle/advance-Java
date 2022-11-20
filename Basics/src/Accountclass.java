import java.util.Scanner;

public class Accountclass {

	int Account = 50000;
	int balance = 1000;
	static String bankname;

	public void deposit(int amount) {

		balance = balance + amount;
		System.out.println("amounnt deposited" + amount);
		System.out.println("update balance" + balance);
	}

	public void withdraw(int amount) {
		if (balance > 1500)
			balance = balance - amount;
		System.out.println("amount removed" + amount);
		System.out.println("remaining balance" + balance);

	}

	public static void main(String[] args) {
		Accountclass.bankname = " welcome to SBI ";
		System.out.println(bankname);
		Scanner scanner = new Scanner(System.in);
		while (true) {
			
		System.out.println("Enter 1. deposit , 2.withdraw 3. exit");
		Accountclass aa = new Accountclass();
		int choice = scanner.nextInt();
		System.out.println("enter amount");
		int amount =scanner .nextInt();

		if (choice == 1) 
			aa.deposit(amount);
	
		else if (choice == 2) {
			aa.withdraw(amount);

		}else {
			System.exit(0);
		}

	}

}}
