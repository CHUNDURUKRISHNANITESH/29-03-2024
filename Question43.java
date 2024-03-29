package assign;

import java.util.Scanner;

public class Question43 {  
    public static void main(String[] args) {  
  
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Ennter array size");
    	int size=sc.nextInt();
    	int [] arr=new int[size];
    	System.out.println("enter the array elements");
    	for(int i=0;i<=arr.length-1;i++) {
    		arr[i]=sc.nextInt();
    	}
        int min = arr[0];  
        for (int i = 0; i < arr.length; i++) {  
           if(arr[i] < min)  
               min = arr[i];  
        }  
        System.out.println("Largest element present in given array: " + min);  
    }  
}  