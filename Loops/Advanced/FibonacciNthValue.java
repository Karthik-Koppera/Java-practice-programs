// FibonacciNthValue.java

import java.util.Scanner;

public class FibonacciNthValue {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        int a = 0, b = 1, c, count = 0, N;
        System.out.println("Enter N value: ");
        N = sc.nextInt(); // Read Integer input

        // Generate Fibonacci numbers until 'higher'
        while(a<=100) 
        {
                System.out.print(a + " ");
                count+=1;

                if(count == N)
                {
                    System.out.println();
                    System.out.println("Fibonacci " + N + "th " + "value is " + a);
                    break;
                }
            c = a + b; 
            a = b;
            b = c;
        }

        // Close scanner object
        sc.close();
    }
}
