package week2;

import java.util.Scanner;

public class Pattern_Three {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int number = sc.nextInt();
	    int i, j;
	      
	    
	    for(i = number; i >= 1; i--)
	    {
	       
	        for(j = i; j < number; j++)
	        {
	            System.out.print(" ");
	        }
	        
	        for(j = 1; j <= (2 * i - 1); j++)
	        {
	            System.out.print("*");
	        }
	        
	        System.out.println("");
	    } 

	}
}


