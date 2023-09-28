
/*============================
 * // A program that takes 
 * user input, stores it in 
 * a variable, and then displays it.
 * 
 =============================*/
package javaCamp;
import java.util.Scanner;
public class class06 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter your name: ");
	        String name = scanner.nextLine();
	        System.out.println("Hello, " + name + "!");
	        scanner.close();
	    }
	}



