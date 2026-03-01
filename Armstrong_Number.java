import java.util.*;
public class Armstrong_Number {
	public static void main(String args [] ) {
		int num, d1, d2, d3;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a three digit number :");
		num = in.nextInt();
		d1 = num / 100;
		d2 = (num/10) % 10;
		d3 = num % 10;
		if(d1*d1*d1+d2*d2*d2+d3*d3*d3 == num)
			System.out.println("It is armstrong number");
		else
			System.out.println("It is not armstrong number");
	}

}
