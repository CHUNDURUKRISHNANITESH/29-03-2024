package assign;

import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ennter array size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter the array elements");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 5) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}