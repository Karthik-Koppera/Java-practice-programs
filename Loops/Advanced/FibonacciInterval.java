// FibonacciInterval.java

import java.util.Scanner;

public class FibonacciInterval {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user to enter range
        System.out.print("Enter lower value: ");
        int lower = sc.nextInt();

        System.out.print("Enter higher value: ");
        int higher = sc.nextInt();

        int a = 0, b = 1, c;

        System.out.println("Fibonacci numbers between " + lower + " and " + higher + ":");

        // Generate Fibonacci numbers until 'higher'
        while (a <= higher) {
            if (a >= lower) {
                System.out.print(a + " ");
            }
            c = a + b; 
            a = b;
            b = c;
        }

        // Close scanner object
        sc.close();
    }
}
