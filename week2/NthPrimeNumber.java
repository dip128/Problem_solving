package week2;

import java.util.Scanner;

public class NthPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of nth prime number");
		int n = sc.nextInt();
		int num=1;
		int count =1;
		while(count<=n) {
			
			boolean flag=true;
			num=num+1;
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					flag=false;
					break;
				}
			}
			
			if(flag==true) {
				count++;
			}
			
		}
		
		System.out.println(num);

	}

}
