import java.util.Scanner;

public class GPA {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter a student record: ");
		String[] userInput = console.nextLine().split(" ", 0);

		int accumulation = 0;

		for(int i = 2; i < Integer.valueOf(userInput[1]) + 2; i++) {
			accumulation += Integer.valueOf(userInput[i]);
		}

		System.out.println(userInput[0] + "'s grade is " + (float) accumulation / (userInput.length - 2));
	}
}