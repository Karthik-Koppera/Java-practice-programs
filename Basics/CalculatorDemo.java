// CalculatorDemo.java
import java.util.Scanner; // create a Scanner class for user input

public class CalculatorDemo 
{
    public static void main(String[] args) 
    {
        // creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Read First number
        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble(); // reading input by using the object

        // Read second number
        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble(); // reading input by using the object

        // Arithmetic operations
        double sum = num1 + num2;
        double diff = num1 - num2;
        double prod = num1 * num2;
        double quot = num1 / num2;

        // Print input to the console
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
        System.out.println("Quotient: " + quot);

        // close scanner object to prevent resource leak
        sc.close();
    }
}
