package assign;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a anumber");
    	double c=sc.nextDouble(); 
        double f = (c * 9/5) + 32;
        System.out.println("After converting celsius to fahrenheit the value is " + f);
    }
}