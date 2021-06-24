package problems;

import java.util.Scanner;

public class OddEven1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to check: ");
		int n = sc.nextInt();
		
		if(n%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd");
		}
	}
	
	

}
