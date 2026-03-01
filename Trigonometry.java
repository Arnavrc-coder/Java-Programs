import java.util.*;
public class Trigonometry {
	public static void main (String args []) {
		double degrees, radians;
		Scanner in = new Scanner (System.in);
		System.out.println("Hello, I ama a trigonometry calculator.");
		System.out.println("I can tell you the value of any angle.");
		System.out.println("Enter the value of angle in degrees which you want to calculate:");
		degrees = in.nextDouble();
		radians = Math.toRadians(degrees);
		double sin_angle = Math.sin(radians);
		double cos_angle = Math.cos(radians);
		double tan_angle = Math.tan(radians);
		System.out.println("Sin " + degrees + " = " + sin_angle);
		System.out.println("Cos " + degrees + " = " + cos_angle);
	    System.out.println("Tan " + degrees + " = " + tan_angle);
	}

}
