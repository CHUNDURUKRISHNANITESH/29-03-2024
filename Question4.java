package assign;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();

		int hour = 24 * days;
		int min = hour * 60;
		int sec = min * 60;

		System.out.println(sec);

	}
}