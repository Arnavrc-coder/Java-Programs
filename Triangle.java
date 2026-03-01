import java.util.*;

public class Triangle {
    public static void main(String args[]) {
        double s1, s2, s3;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the 3 sides of triangle:");
        s1 = in.nextDouble();
        s2 = in.nextDouble();
        s3 = in.nextDouble();

        // Check triangle possibility using triangle inequality
        if (s1 + s2 > s3 && s2 + s3 > s1 && s3 + s1 > s2) {
            System.out.println("Triangle is possible.");
            
            // Type of triangle
            if (s1 == s2 && s2 == s3) {
                System.out.println("Equilateral triangle");
            } else if (s1 == s2 || s2 == s3 || s3 == s1) {
                System.out.println("Isosceles triangle");
            } else {
                System.out.println("Scalene triangle");
            }
        } else {
            System.out.println("Triangle is not possible");
        }
    }
}
