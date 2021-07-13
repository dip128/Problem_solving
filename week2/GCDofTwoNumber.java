package week2;

import java.util.Scanner;

public class GCDofTwoNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Number:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		while(a!=b) {
			if(a>b) {
				a=a-b;
			}
			else {
				b=b-a;
			}
		}
		System.out.println("GCD is "+a);
		
	}

}
