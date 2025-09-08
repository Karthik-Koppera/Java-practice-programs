// FibonacciSeries.java
import java.util.Scanner; // import Scanner class to take input

public class FibonacciSeries {
    public static void main(String args[]){
        // Declaring variables
        int a = 0, b = 1, c;

        // Creating Scanner object to read input
        Scanner sc = new Scanner(System.in); 

        // Ask user to enter number
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Read Integer input

        // for loop for iterating to perform fibonacci series
        for(int i=1; i<=num; i+=1){
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }

        // close the scanner object to prevent resouce leak
        sc.close();
    }
}
