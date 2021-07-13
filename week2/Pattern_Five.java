package week2;

import java.util.Scanner;

public class Pattern_Five {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n = sc.nextInt();
		int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j<=i) {
					System.out.print(k+++" ");
				}
				else {
					break;
				}
			}
			System.out.println();
		}
	}

}
