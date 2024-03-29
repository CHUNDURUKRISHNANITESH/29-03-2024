package assign;

import java.util.Scanner;

public class Question20 
{ 
    public static int gcd(int a, int b) 
    { 
        if (a == 0) 
            return b;  
        return gcd(b % a, a);  
    }   
    public static int lcm(int a, int b) 
    { 
        return (a / gcd(a, b)) * b; 
    }   
    public static void main(String[] args)  
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int a=sc.nextInt();
        System.out.println("Enter b value");
        int b=sc.nextInt();
        System.out.println("LCM of " + a +" and " + b + " is " + lcm(a, b)); 
    } 
} 