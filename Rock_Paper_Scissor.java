import java.util.*;

public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        String[] options = {"Rock", "Paper", "Scissor"};
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your choice: Rock, Paper or Scissor");
        String userChoice = in.next().toLowerCase(); // make user input lowercase

        String computerChoice = options[random.nextInt(3)].toLowerCase(); // also lowercase
        System.out.println("Computer chose: " + computerChoice);

        // Decide winner
        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a draw!");
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissor")) ||
                   (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                   (userChoice.equals("scissor") && computerChoice.equals("paper"))) {
            System.out.println("You win!");
        } else if ((userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissor"))) {
            System.out.println("You lose!");
        } else {
            System.out.println("Invalid input!");
        }
    }
}
