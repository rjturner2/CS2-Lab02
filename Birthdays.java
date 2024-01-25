import java.util.Scanner;

public class Birthdays {

	public static void main(String[] args) {
		String[] userOneBirthday = getUserBirthday("What month was User 1 born in?", "What day was User 1 born on?");
		String[] userTwoBirthday = getUserBirthday("What month was User 2 born in?", "What day was User 2 born on?");
		String[] currentDate = getUserBirthday("What is the current month?", "What day of that month is it?");

		int userOneAbsolute = totalDays(userOneBirthday[0], Integer.valueOf(userOneBirthday[1]));
		int userTwoAbsolute = totalDays(userTwoBirthday[0], Integer.valueOf(userTwoBirthday[1]));
		int currentDayAbsolute = totalDays(currentDate[0], Integer.valueOf(currentDate[1]));

		int userOneBirthdayDistance = userOneAbsolute - currentDayAbsolute;
		int userTwoBirthdayDistance = userTwoAbsolute - currentDayAbsolute;

		if(userOneBirthdayDistance < 0) {
			userOneBirthdayDistance *= -1;
		}
		
		if(userTwoBirthdayDistance < 0) {
			userTwoBirthdayDistance *= -1;
		}

		if(userOneBirthdayDistance < userTwoBirthdayDistance) {
			System.out.println("User 1's birthday is only " + userOneBirthdayDistance + " days away, which is less than User 2's birthday which is " + userTwoBirthdayDistance + " days away.");
		}
		else {
			System.out.println("User 2's birthday is only " + userTwoBirthdayDistance + " days away, which is less than User 1's birthday which is " + userOneBirthdayDistance + " days away.");
		}
	}

	public static String[] getUserBirthday(String formatter, String formatterTwo) {
		String[] userBirthMonthAndDay = new String[2];

		Scanner console = new Scanner(System.in);
		System.out.print(formatter + ": ");
		userBirthMonthAndDay[0] = console.next();

		System.out.print(formatterTwo + ": ");
		userBirthMonthAndDay[1] = console.next();

		return userBirthMonthAndDay;
	}

	public static int totalDays(String month, int day) {
		String[] monthsInOrder = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		int monthQuantity = findIndex(monthsInOrder, month);
		int dayAccumulation = 0;

		for(int i = 0; i < monthQuantity; i++) {
			dayAccumulation += getMonthInteger(monthsInOrder[i]);
		}

		dayAccumulation += day;

		return dayAccumulation;

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

	public static int findIndex(String[] currentArray, String item) {
		for(int i = 0; i < currentArray.length; i++) {
			if(currentArray[i].equalsIgnoreCase(item)) {
				return i;
			} 
		}
		return -1;
	}
}