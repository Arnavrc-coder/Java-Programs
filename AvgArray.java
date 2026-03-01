import java.util.*;
public class AvgArray {
	static int Avg_Array(int n[]) {
		int sum = 0;
		for(int i = 0; i < n.length; i++) {
			sum = sum + n[i];
		}
		int avg = sum/n.length;
		return avg;
	}
	public static void main(String args []) {
		Scanner in = new Scanner(System.in);
		int n[] = new int[10];
				System.out.println("Enter 10 nos. :");
	for(int i = 0; i < 10; i++) {
		n[i] = in.nextInt();
		
	}
	int result = Avg_Array(n);
	System.out.println("Average = " + result);
}
}