package week2;

import java.util.Scanner;

public class SwapTwoNumberWithoutUsingThird {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter two Number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		 a = a*b;
		 b=a/b;
		 a=a/b;
		 System.out.println(a+" "+b);
		

	}

}
