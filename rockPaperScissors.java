import java.util.Scanner;
public class rockPaperScissors {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Choose Rock , Paper or Scissors");
		String userMove = input.nextLine().toLowerCase();
		double randomNumber= Math.random();
		String comMove = " ";
		if (randomNumber > 0.33){
		 comMove = "rock";
		}else if(randomNumber <0.66){
		 comMove = "paper";
			}else{
				comMove = "scissors";
				}
		System.out.println("The computer has chossen "+ comMove);
		if(userMove.equals(comMove)){
			System.out.println("Its a tie!");
		}else if(
		(userMove.equals("rock")&&comMove.equals("scissors"))||
		(userMove.equals("paper")&&comMove.equals("rock"))||
		(userMove.equals("scissors")&&comMove.equals("paper"))
			){
			System.out.println("You win!");
				}else{
				System.out.println("Computer wins!");
					}
	}
}