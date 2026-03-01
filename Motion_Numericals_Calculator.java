import java.util.*;
public class Motion_Numericals_Calculator {
public static void main (String args []) {
double u, v, S, a, t;
Scanner in = new Scanner(System.in);
System.out.println("Enter what do you want to calculate:");
String thingtofind = in.next().toLowerCase();
switch (thingtofind) {
case "acceleration" :
	System.out.println("Enter initial velocity:");
	u = in.nextDouble();
	System.out.println("Enter final velocity:");
	v = in.nextDouble();
	System.out.println("Enter time:");
	t = in.nextDouble();
	a = (v-u)/t;
	System.out.println("Acceleration  = " + a);
	break;
	
case "distance" :
	System.out.println("Enter initial velocity:");
	u = in.nextDouble();
	System.out.println("Enter final velocity:");
	v = in.nextDouble();
	System.out.println("Enter time:");
	t = in.nextDouble();
	a = (v-u)/t;
	S = (u*t) + ((1/2.0)*a*t*t);
	System.out.println("Distance = " + S ); 
	break;
	
case "velocity" :
	System.out.println("Enter time:");
	t = in.nextDouble();
	System.out.println("Enter distance:");
	S = in.nextDouble();
	System.out.println("Enter acceleration:");
	a = in.nextDouble();
	System.out.println("Enter initial velocity:");
	u = in.nextDouble();
	v = u +a*t;
	System.out.println("Velocity = " +v);
	break;
	
case "time" :
	System.out.println("Enter initial velocity:");
	u = in.nextDouble();
	System.out.println("Enter final velocity:");
	v = in.nextDouble();
	System.out.println("Enter acceleration:"); 
	a = in.nextDouble();
	t = (v-u)/a;
	System.out.println("Time = " + t);
	
}

}

}