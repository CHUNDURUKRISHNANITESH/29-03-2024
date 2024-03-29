package assign;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
        System.out.println("enter your distance");
        int distance = scan.nextInt();
        System.out.println("enter the time");
        int time=scan.nextInt();
        int speed = distance/time;
        System.out.println("speed is :"+ speed); 
    }
}