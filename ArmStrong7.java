package problems;

import java.util.Scanner;

public class ArmStrong7 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to check: ");
		int n = sc.nextInt();
		
		int curr = n;
		
		int number_digits=0;
		
		while(curr>0) {
			number_digits++;
			curr/=10;
		}
		
		curr=n;
		int sum=0;
		while(curr>0) {
			int t = curr%10;
			sum+=Math.pow(t, number_digits);
			curr/=10;
		}
		
		if(n==sum) {
			System.out.println("ArmStrong Number");
		}
		else {
			System.out.println("Not ArmStrong");
		}
	}

}
