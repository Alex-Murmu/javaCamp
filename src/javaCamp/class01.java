package javaCamp;

import java.util.Scanner;

public class class01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,fact,number;
		fact=1;
		number = sc.nextInt();
		
		if(number==1 || number==0) {
			System.out.println("factorial of "+number+" is :"+fact);
		}
		else {
			for(i=1;i<=number;i++) {
				fact=fact*i;
			}
			System.out.println("factorial of "+number+"is :"+fact);
		}
		
		
		
	}

}
