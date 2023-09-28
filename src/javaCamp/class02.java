package javaCamp;

import java.util.Scanner;

public class class02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter the number");
		a = sc.nextInt();
		System.out.println("Enter the number");
		b = sc.nextInt();

		int gcd=1;
		for(int i=1;i<=a && i<=b;i++) {
			if(a%i==0 && b%i==0)
				gcd =i;
		}
		System.out.println("GCD of "+a+" and "+b+" is :"+gcd);
		
		
		}

}
