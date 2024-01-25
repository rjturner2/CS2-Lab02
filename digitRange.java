public class digitRange {
	public static void main(String[] args) {
		System.out.println(digitRange(83));
	}

	public static int digitRange(int n) {
		int[] digitArrayInt = splitInteger(n);

		int maxInteger = max(digitArrayInt);
		int minInteger = min(digitArrayInt);

		return maxInteger - minInteger + 1;
	}

	public static int max(int[] n) {
		int currentMax = 0;
		for(int i = 0; i < n.length; i++) {
			if(n[i] > currentMax) {
				currentMax = n[i];
			}
		}
		return currentMax;
	}

	public static int min(int[] n) {
		int currentMin = 10;
		for(int i = 0; i < n.length; i++) {
			if(n[i] < currentMin) {
				currentMin = n[i];
			}
		}
		return currentMin;
	}

	public static int[] splitInteger(int n) {
		// first we need to get the length of the integer
		int length = 0;

		for(int i = 1; i < n; i *= 10) {
			length += 1;
		}

		int[] integerSplit = new int[length];
		for(int i = 0; i < length; i++) {
			integerSplit[i] = (n / (int) (Math.pow(10, i))) % 10;
		}

		return integerSplit;
	}	
}