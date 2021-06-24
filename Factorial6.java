package problems;

import java.util.Scanner;

public class Factorial6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to calculate: ");
		int n = sc.nextInt();
		int res=1;
		for(int i=1;i<=n;i++) {
			res*=i;
		}
		
		System.out.println("Factorial is "+res);
	}

}
