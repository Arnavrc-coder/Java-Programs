import java.util.*;
public class Abundant {
	public static void main(String args []) {
		double i, n, x, s =0;
		Scanner in = new Scanner(System.in);
				System.out.println("Enter a no. :");
				n = in.nextDouble();
				for(i =1; i < n; i++) {
				x = n%i;
				if(x == 0)
					s = s + i;
				}
				if(s>n)
					System.out.println("Abundant No.");
				else
					System.out.println("Not abundant no.");
	}

}
