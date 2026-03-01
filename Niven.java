import java.util.*;
public class Niven {
public static void main (String args [] ) {
	int sum = 0, n, i, d;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a no.:");
	n = in.nextInt();
	for(i=n; i>0; i=i/10) {
		d = i%10;
		sum = sum + d;
	}
	if(n % sum == 0)
		System.out.println("Niven no.");
	else
		System.out.println("Not niven no.");
}
}
