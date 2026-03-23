import java.util.*;
public class Twin_Prime {
	public static int Prime(int n, int n1) {
		int i, c = 0, c1 = 0, diff = 0, k = 0;
		for(i = 1; i <= n; i++) {
			if(n%i == 0)
				c++;
		}
		for(i = 1; i <= n1; i++) {
			if(n1%i == 0)
				c1++;
		}
		diff = Math.abs(n - n1);
		if(c == 2 && c1 == 2 && diff == 2)
			k++;
		return k;
	}
	public static void main(String args []) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 2 nos. : ");
		int n = in.nextInt();
		int n1 = in.nextInt();
		int check = Prime(n, n1);
		if(check == 1)
			System.out.println("Twin prime");
		else
			System.out.println("Not twin prime");
	}
}
