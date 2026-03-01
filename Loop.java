import java.util.*;
public class Loop {
public static void main (String args []) {
String name = "";
Scanner in = new Scanner (System.in);
System.out.println("Enter your name :");
name = in.nextLine();
while (name.isEmpty()) {
System.out.println("Enter your name :");
name = in.nextLine();
}
}
}