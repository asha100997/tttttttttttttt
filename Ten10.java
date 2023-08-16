package FORLOOPS;

import java.util.Scanner;

public class Ten10 {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		 n =sc.nextInt();
		while(n>=0) {
			if(n%10==0) {
				System.out.println(n);
				break;
			}
			n--;
		}
	}

}
