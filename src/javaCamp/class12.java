/*======================
 * Check if a Number is Prime
 * 
 =======================*/
package javaCamp;
import java.util.Scanner;
public class class12 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num;
	System.out.println("Enter any number");
	num = sc.nextInt();
    boolean isPrime = true;
    
    if (num <= 1) {
        isPrime = false;
    } else {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
    }
    
    if (isPrime) {
        System.out.println(num + " is a prime number.");
    } else {
        System.out.println(num + " is not a prime number.");
    }
		
	}

}
