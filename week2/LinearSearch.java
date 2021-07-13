package week2;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in an array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the elements you want to search");
		int k= sc.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==k) {
				System.out.println("Elemet found at: "+i);
				return;
			}
		}
		System.out.println("Elements not found");

	}

}
