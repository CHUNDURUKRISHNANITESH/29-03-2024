package assign;

import java.util.Scanner;

public class Question21 {    
    public static void main(String[] args) {        
        
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Ennter array size");
    	int size=sc.nextInt();
    	int [] arr=new int[size];
    	System.out.println("enter the array elements");
    	for(int i=0;i<=arr.length-1;i++) {
    		arr[i]=sc.nextInt();
    	}
        int temp = 0;          
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }        
        System.out.println("sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }    
}    