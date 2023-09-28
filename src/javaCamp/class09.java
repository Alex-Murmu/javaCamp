/*==============================
 * Calculate Factorial of a Number
 ===============================*/
package javaCamp;
import java.util.Scanner;
public class class09 {
public static void main(String[] args) {
	
	 int num = 5;
     int factorial = 1;
     
     for (int i = 1; i <= num; i++) {
         factorial *= i;
     }
     
     System.out.println("Factorial of " + num + " is " + factorial);
	}
}
