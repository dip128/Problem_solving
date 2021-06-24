package problems;

import java.util.Scanner;

public class StudentPass3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student's number you want to check: ");
		int n = sc.nextInt();
		
		System.out.println(n>=70?"pass":"fail");

	}

}
