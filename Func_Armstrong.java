import java.util.*;
public class Func_Armstrong {
	public int Armstrong(int n) {
		int c = 0, d, i, a = 0;
		double s = 0;
		for(i = n; i > 0; i = i/10) {
			d = i % 10;
			c++;
		}
		for(i = n; i > 0; i = i/10) {
			d = i % 10;
			s = s + Math.pow(d,c);
		}
		if(s == n)
			a++;
		return(a);
	}
	public static void main(String args []) {
		int a,check;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a no. :");
		int n = in.nextInt();
		Func_Armstrong ob = new Func_Armstrong();
		check = ob.Armstrong(n);
		if(check == 1)
			System.out.println("Armstrong no.");
		else
			System.out.println("Not Armstrong no.");
	}
}
