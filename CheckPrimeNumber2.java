package problems;

import java.util.Scanner;

public class CheckPrimeNumber2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to check: ");
		int n = sc.nextInt();

		if (n == 0 || n == 1) {
			System.out.println("Number is not prime");
			System.exit(0); // It will terminate the program with status code 0
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.println("Number is not prime");
				System.exit(0); // It will terminate the program with status code 0
			}
		}
		System.out.println("Number is prime");
	}

}
