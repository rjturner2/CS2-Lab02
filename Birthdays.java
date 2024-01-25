import java.util.Scanner;

public class Birthdays {
	final int daysInYear = 365;
	final String[] monthsInOrder = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

	public static void main(String[] args) {
		
	}

	public static String[] getUserBirthday() {
		String[] userBirthMonthAndDay = new String[2];

		Scanner console = new Scanner(System.in);
		System.out.print("What month were you born in?: ");
		userBirthMonthAndDay[0] = console.next();

		System.out.print("What day were you born on?: ");
		userBirthMonthAndDay[1] = console.next();

		return userBirthMonthAndDay;
	}

	public static int getMonthInteger(String month) {
		switch (month) {
		case "February":
			return 28;
		case "September", "April", "June", "November":
			return 30;
		case "January", "March", "May", "July", "August", "December", "October":
			return 31;
		default:
			return 0;
		}
	}
}