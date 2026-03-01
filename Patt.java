public class Patt {
    public static void main(String args[]) {
        int i, j;

        for (i = 1; i <= 5; i++) {       // Outer loop → rows
            for (j = 1; j <= i; j++) {   // Inner loop → stars in each row
                System.out.print("*");
            }
            System.out.println();         // Move to next line after each row
        }
    }
}
