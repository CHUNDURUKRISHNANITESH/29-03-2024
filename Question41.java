package assign;

import java.util.Scanner;

public class Question41 {
	public static void main(String[] arg) {
		int i = 1, a, arm, n, temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your ending range");
		int range=sc.nextInt();
		while (i < range) {
			n = i;
			arm = 0;
			while (n > 0) {
				a = n % 10;
				arm = arm + (a * a * a);
				n = n / 10;
			}
			if (arm == i)
				System.out.println(i);
			i++;
		}
	}
}