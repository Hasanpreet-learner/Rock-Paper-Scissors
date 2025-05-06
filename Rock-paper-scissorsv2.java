import java.util.Scanner;

public class rockPaperScissors_v2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int playerScore = 0;
        int computerScore = 0;
        int round = 1;

        do {
            System.out.println("\nRound " + round + ":");
            System.out.println("Enter your move (rock, paper, or scissors):");
            String userMove = input.nextLine().toLowerCase();

            double randomNumber = Math.random();
            String comMove = " ";
            if (randomNumber < 0.33) {
                comMove = "rock";
            } else if (randomNumber < 0.66) {
                comMove = "paper";
            } else {
                comMove = "scissors";
            }

            System.out.println("The computer has chosen: " + comMove);

            if (userMove.equals(comMove)) {
                System.out.println("It's a tie!");
            } else if (
                (userMove.equals("rock") && comMove.equals("scissors")) ||
                (userMove.equals("paper") && comMove.equals("rock")) ||
                (userMove.equals("scissors") && comMove.equals("paper"))
            ) {
                System.out.println("You win this round!");
                playerScore++;
            } else {
                System.out.println("Computer wins this round!");
                computerScore++;
            }

            System.out.println("Score --> You: " + playerScore + " | Computer: " + computerScore);
            round++;
        } while (playerScore < 3 && computerScore < 3);

        // Final result
        if (playerScore == 3) {
            System.out.println("Congratulations! You won the game!");
        } else {
            System.out.println("Computer won the game. Better luck next time!");
        }

        input.close();
    }
}