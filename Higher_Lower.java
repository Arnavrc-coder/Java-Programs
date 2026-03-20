import java.util.*;
public class Higher_Lower {
	public static void main(String args[]) {
		int ran1, ran2;
		Scanner in = new Scanner(System.in);
		ran1 = (int) Math.round(Math.random() * 100 +1);
		ran2 = (int) Math.round(Math.random() * 100 +1);
		System.out.println("Hello Player! You are playing a game.");
		System.out.println("The computer has generated a random number.");
		System.out.println("You have to tell that the next randomly generated no. will be greater or lesser than this no.");
		System.out.println("The current random no. is : " + ran1);
		System.out.println("Enter H if you think the next no. will be higher or enter L if you think the next no. will be lower");
		String guess = in.nextLine().toUpperCase();
		if(guess.equals("H")) {
			if(ran2 > ran1)
				System.out.println("You win!");
			else
				System.out.println("You lost!");
			System.out.println("The no. was " + ran2);
		}
		else {
			if(ran2 < ran1)
				System.out.println("You win!");
			else
				System.out.println("You lost!");
			System.out.println("The no. was " + ran2);
		}
	}
}
