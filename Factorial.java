import java.util.*;
public class Factorial {
public static void main(String args [] ) {
int num, i, fac;
Scanner in = new Scanner(System.in);
System.out.println("Enter the number :");
num = in.nextInt();
System.out.println("Factors are:");
for(i=1; i<=num; i++)
	if(num % i == 0) {
		System.out.println(i);
}
fac = 1;
System.out.println("Factorial = ");
for(i = 1; i <= num; i++) {
	fac = fac*i;
}
System.out.println(fac);
}
}