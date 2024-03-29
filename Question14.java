package assign;
import java.util.Scanner;
public class Question14 {
	public static void main(String[] args) {
		int m = 1000;
		System.out.println("Enter Kilometer: ");
		Scanner reader = new Scanner(System.in);
		int km = reader.nextInt();
		int kmtometer = km * m;
		System.out.println(km + " kilometers is " + kmtometer + " in meters");
	}
}
