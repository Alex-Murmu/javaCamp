/*=================================
 *  Calculate the Power of a Number
 =================================*/
package javaCamp;
public class class10 {
public static void main(String[] args) {
	int base = 2;
    int exponent = 3;
    
    long result = 1;
    
    for (int i = 1; i <= exponent; i++) {
        result *= base;
    }
    
    System.out.println(base + " raised to the power of " + exponent + " is " + result);
		
	}

}
