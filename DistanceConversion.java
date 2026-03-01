import java.util.*;

public class DistanceConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double cm, m, km;
        System.out.println("Enter distance in cm:");
        cm = in.nextDouble();

        m = cm / 100.0;
        km = cm / 100000.0;

        System.out.println("Distance in cm = " + cm);
        System.out.println("Distance in m = " + m);
        System.out.println("Distance in km = " + km);
    }
}
