import java.util.*;
public class Electrical_Bill {
	public static void main(String args []) {
		double bill = 0, unit;
		String name;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter your name :");
		name = in.next();
		System.out.println("Enter units consumed :");
		unit = in.nextDouble();
		if(unit<=100) {
			bill = unit * 4.8;
		}
		if(unit>100 && unit<=300) {
			bill = unit * 5.3;
		}
		if(unit>300 && unit<=500) {
			bill = unit * 6.8;
		}
		if(unit>500) {
			bill = unit * 7.5;
		}
		System.out.println("Name :" + name);
		System.out.println("Bill = ₹"+bill);
	}

}
