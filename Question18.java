package assign;

import java.util.Scanner;

public class Question18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your range number");
		int num = sc.nextInt();
		for (int i = 0; i <= num; i++) {
			int count = 0;
			for (int j = 1; j <= num; j++)
				if (i % j == 0)
					count++;
			if (count == 2)
				System.out.print(i + " ");
		}
	}
}