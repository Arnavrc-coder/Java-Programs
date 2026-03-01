import java.util.*;
public class Smartboard {
	public static void main (String args [] ) {
	double smdq, smdc, stylq, stylc;
	Scanner in = new Scanner(System.in);
    System.out.println("Enter smartboard quantity :");
	smdq = in.nextDouble();
	System.out.println("Enter each smartboard cost :");
	smdc = in.nextDouble();
	System.out.println("Enter stylus quantity :");
	stylq = in.nextDouble();
	System.out.println("Enter each stylus cost :");
	stylc = in.nextDouble();
	double smartboard_cost = smdc*smdq;
	double discount_smartboard = 20/100.0*smartboard_cost;
	double smartboard_discounted_price = smartboard_cost- discount_smartboard;
	double stylus_cost = stylc*stylq;
	double discount_stylus = 5/100.0*stylus_cost;
	double stylus_discounted_price = stylus_cost - discount_stylus;
	double total_cost = smartboard_discounted_price + stylus_discounted_price;
    System.out.println("Smartboard Quantity = " + smdq);
    System.out.println("Each smartboard Cost = " + smdc);
    System.out.println("Total Smartboard Cost = " + smartboard_cost);
    System.out.println("Discounted Smartboard Cost = " + smartboard_discounted_price);
    System.out.println("Stylus Quantity = " + stylq);
    System.out.println("Each stylus cost = " + stylc);
    System.out.println("Total Stylus Cost = " + stylus_cost);
    System.out.println("Discounted Stylus Cost = " + stylus_discounted_price);
    System.out.println("Total bill = " + total_cost);


}
	
}
 