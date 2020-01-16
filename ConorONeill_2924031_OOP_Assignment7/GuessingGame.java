import java.util.Random;
import java.util.Scanner;

class GuessingGame {
	private int answer;
	private int[] guesses;
	
	GuessingGame(int a, int[] g) {
		answer = a;
		guesses = g;
		
		int[] guesses = new int[9];
		Random rand = new Random();
		int answer = rand.nextInt(50) + 1;
	}
	
	public void startGame() {
		try {
			System.out.println("This is the start of the Game. You have 10 chances to guess the correct answer.");
			for (int i = 0; i <= guesses.length;) {
				 Scanner sc = new Scanner(System.in);
				 System.out.println("Please enter a number as your next guess: ");
				 int n = sc.nextInt();
				 if (n == answer) {
					 System.out.println("Congradulations! You have guessed the answer correctly.");
					 break;
				 } else {
					 System.out.println("Im sorry, but that is the wrong answer.");
					 for (int j = 0; j <= guesses.length;) {
							if (guesses[i] == 0) {
								guesses[i] = n;
							} else {
								j++;
							}
					 }
					 System.out.print(guesses);
				 }
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("You have run out of guesses, GAME OVER.");
			e.printStackTrace();
		}
	}
	
	class GuessingTest {
		GuessingGame.startGame();
	}
}
