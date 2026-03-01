import java.util.*;
public class Calculator {
	public static void main(String[] args) {		
	double n1,n2,result;
	Scanner in = new Scanner (System.in);
	System.out.println("Hello, I am a calculator");
	System.out.println("If you want to calculate something, you must:");
	System.out.println("Enter first number:");
	n1 = in.nextDouble();
	System.out.println("Enter second number:");
	n2 = in.nextDouble();
	System.out.println("Enter operator: +, -, *, /,%");
	char opr = in.next().charAt(0);
	
	switch (opr) {
	case '+':
		result = n1 + n2;
		System.out.println("Result = " + result);
		break;
	case '-':
		result = n1 - n2;
		System.out.println("Result = " + result);
		break;
	case '*':
		result = n1 * n2;
		System.out.println("Result = " + result);
		break;
	case '/':
		result = n1 / n2;
		System.out.println("Result = " + result);
		break;
	case '%':
		result = n1 % n2;
		System.out.println("Result = " + result);
		break;
		default:
		System.out.println("You are chomtu");
	}
	
	}

}