public class Pattern {
public static void main (String args []) {
	for (int i = 1; i<=199; i++) {
		for (int j = 199; j>=i; j--) {
			System.out.print("*");
		}
		System.out.println(" ");
	}
}
}