import java.util.Scanner;

public class Birthdays {
	final int daysInYear = 365;
	final String[] monthsInOrder = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

	public static void main(String[] args) {
		
	}

	public static String getUserBirthday() {
		Scanner console = new Scanner(System.in);
		System.out.print("What month were you born in?: ");
		String userOneMonth = console.next();

		return "Null";
	}

	public static int getMonthInteger(String month) {
		switch (month) {
		case "February":
			return 28;
		case "September", "April", "June", "November":
			return 30;
		case "January", "March", "May", "July", "August", "December":
			return 31;
		default:
			return 0;
		}
	}
}