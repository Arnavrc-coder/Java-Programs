import java.util.*;
public class Lead_Number {
public static void main (String args [] ) {
	int i, s1 = 0, s2 = 0, n, d;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a no. :");
	n = in.nextInt();
	for(i=n;i>0;i=i/10) {
		d= i%10;
		if(d%2 == 0)
			s1 = s1 + d;
		else
			s2 = s2 + d;
	}
	if(s1 == s2)
		System.out.println("Lead no.");
	else
		System.out.println("Not Lead no.");
}
}