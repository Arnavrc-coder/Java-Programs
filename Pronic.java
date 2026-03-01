import java.util.*;
public class Pronic {
public static void main(String args []) {
	int i, n;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a no. :");
	n = in.nextInt();
	for(i=1; i<=n; i++) {
			if(i*(i+1) == n) {
				System.out.println("Pronic no.");	
			break;
	}	
	}
	if(i>n) {
		System.out.println("Not pronic no.");
	} 
}
}