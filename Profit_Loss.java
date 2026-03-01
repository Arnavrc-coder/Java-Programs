import java.util.*;
public class Profit_Loss {

	public static void main(String[] args) {
		
Scanner in = new Scanner(System.in);
double cp, sp, pr, l;
System.out.println("Enter cost price:");
cp = in.nextDouble();
System.out.println("Enter sell price:");
sp = in.nextDouble();
if (sp>cp)
{
	pr = sp - cp;
	double pp = pr/cp*100;
	System.out.println("Its profit");
	System.out.println("Profit = " + pr + " Profit percent = " + pp);

}

else if (cp>sp)
{
	l = cp - sp;
	double lp = l/cp*100;
	System.out.println("Its loss");
	System.out.println("Loss = " + l + " Loss percent = " + lp);

}

else
	System.out.println("Neither profit nor loss.");

	}

}
