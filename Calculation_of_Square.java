import java.util.*;
public class Calculation_of_Square {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double s, p, ar, d;
		System.out.println("Enter the side of square:");
		s = in.nextDouble();
		p = 4*s;
		ar = s*s;
		d = Math.sqrt(Math.pow(s,2)+Math.pow(s,2));
		System.out.println("Perimeter = " + p);
		System.out.println("Area = " + ar);	
		System.out.println("Diagonal = " + d);

	}

}
