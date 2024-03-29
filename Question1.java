package assign;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		System.out.println("Please enter your age:");

		Scanner in = new Scanner(System.in);
		int age = in.nextInt();

		if (age > 60 && age < 80) {
			System.out.println("Senior citizen");

		} else {
			System.out.println("not senior ctitzen");
		}
	}
}