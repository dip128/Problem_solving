package week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DisplayAlterantePrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
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
				list.add(num);
			}
			
		}
		for (int i=0;i<list.size();i+=2) {
			System.out.println(list.get(i));
			
		}
		

	}

}
