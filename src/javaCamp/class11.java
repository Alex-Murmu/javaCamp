/*=======================
 * Generate Fibonacci Series
 * 
 ========================*/
package javaCamp;

public class class11 {
public static void main(String[] args) {
	int n = 10; // Number of terms in the series
    int firstTerm = 0, secondTerm = 1;
    
    System.out.print("Fibonacci Series: ");
    
    for (int i = 1; i <= n; i++) {
        System.out.print(firstTerm + " ");
        int nextTerm = firstTerm + secondTerm;
        firstTerm = secondTerm;
        secondTerm = nextTerm;
    }
	}

}
