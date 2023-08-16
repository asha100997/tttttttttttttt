package FORLOOPS;
import java.util.Scanner;
public class SumCount {
	public static void main(String[] args) {
		double n,sum=0;
		Scanner sc=new Scanner(System.in);
		while(true) {
			n=sc.nextDouble();
			if(n<0.0) {
				break;
				
			}
			sum=sum+n;
					
		}
		System.out.println("sum is:"+sum);
	}

}
