package assign;

import java.util.Scanner;

public class Question19 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first side: ");
		int a = in.nextInt();
		System.out.print("Enter second side: ");
		int b = in.nextInt();
		System.out.print("Enter third side: ");
		int c = in.nextInt();
		int perimeter = a + b + c;
		System.out.println("Perimeter = " + perimeter);
	}
}