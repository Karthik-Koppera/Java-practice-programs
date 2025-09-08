// LargestNumber.java
import java.util.Scanner; // import Scanner class to take input

public class LargestNumber {
    public static void main(String[] args) {
        // Creating Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Ask user to enter number1
        System.out.print("Enter number1: ");
        int num1 = sc.nextInt(); // Read Integer input

        // Ask user to enter number2
        System.out.print("Enter number2: ");
        int num2 = sc.nextInt(); // Read Integer input

        // Compare the two numbers
        if (num1 > num2) {
            System.out.println(num1 + " is the Largest number.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the Largest number.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        // close the scanner object to prevent resource leak
        sc.close();
    }
}
