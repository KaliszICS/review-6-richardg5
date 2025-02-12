public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int sum(int int1, int int2) {
		return int1 + int2;
	}

	public static int difference(int int1, int int2) {
		return int1 - int2;
	}

	public static double product(double num1, double num2) {
		return num1 * num2;
	}

	public static String removeFirst(String input) {
		return input.substring(1);
	}

	public static int combinedLength(String input1, String input2) {
		return input1.length() + input2.length();
	}

	public static boolean isEven(int check) {
		return Math.abs(check) % 2 == 0;
	}

	public static boolean isOdd(int check) {
		return Math.abs(check) % 2 == 1;
	}

	public static boolean isPositive(int check) {
		return check > 0;
	}

	public static boolean isNegative(int check) {
		return check < 0;
	}
}
