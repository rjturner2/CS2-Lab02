import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
public static void main(String[] args) {
boolean guessedCorrectly = false;
int guessesMade = 0;
while(!guessedCorrectly) {
guessedCorrectly = currentGuess();
guessesMade += 1;
}
System.out.println("It took " + guessesMade + " tries for me to guess your number!");
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