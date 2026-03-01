import java.util.*;
public class ATM {
public static void main(String args [] ) throws InterruptedException {
	int balance = 10000, withdraw, deposit, exit, input, amount;
	Scanner in = new Scanner(System.in);
	System.out.println("Hello I am an ATM.");
	System.out.println("What do you want to do ?");
	System.out.println("Enter 1 to check balance, 2 to withdraw money, 3 to deposit money and 4 to exit.");
	input = in.nextInt();
	System.out.println("Enter your pin :");
	int pin = in.nextInt();
	if (pin == 1234) {
	switch(input) {
	case 1: System.out.println("Balance = " + balance);
			System.out.println("Thank You.");
	break;
	case 2: System.out.println("Enter the amount to withdraw :");
	amount = in.nextInt();
	if (amount>10000) {
		System.out.println("Not enough balance, withdrawal failed.");
		System.out.println("Thank You.");
	}
	if (amount<=10000) {
		balance = balance - amount;
		Thread.sleep(900);
		System.out.println("Withdrawal success, remaining balance = " + balance);
		System.out.println("Thank You.");
	}
	break;
	case 3: System.out.println("Enter the amount to be deposited : ");
			amount = in.nextInt();
			balance = amount + balance;
			Thread.sleep(900);
			System.out.println("Amount deposited.");
			System.out.println("Balance now = " + balance);
			System.out.println("Thank You.");
	break;
	case 4: System.out.println("Thank You for coming.");
	break;
	default: System.out.println("Invalid Choice!");
}
}
	else
	System.out.println("Invalid pin entered.");
}
}