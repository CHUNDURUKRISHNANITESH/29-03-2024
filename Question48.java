package assign;

import java.util.Scanner;

public class Question48 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int reverse = 0;
		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println("The reverse of the given number is: " + reverse);
	}
}