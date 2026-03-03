import java.util.*;
public class Fun_Over {
	int a, b;
	int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}
	double sum(double a, double b) {
		double sum = a + b;
		return sum;
	}
	public static void main(String args []) {
		Fun_Over sum = new Fun_Over();
		System.out.println(sum.sum(30,40));
		System.out.println(sum.sum(37.8,40.7));
	}
}
