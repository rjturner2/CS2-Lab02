import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
	public static void main(String[] args) {
		boolean guessedCorrectly = false;
		while(!guessedCorrectly) {
			guessedCorrectly = currentGuess();
		}
	}

	public static boolean currentGuess() {
		Scanner console = new Scanner(System.in);
		Random roll = new Random();

		int currentGuess = roll.nextInt(10) + 1;
		System.out.println("Is " + currentGuess + " your number?: (y/n)");
		String userAnswer = console.next();

		return userAnswer.equalsIgnoreCase("y");
	}
}