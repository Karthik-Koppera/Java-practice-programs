// SumOfDigitsNumber.java

// import Scanner class to read input
import java.util.Scanner;
public class SumOfDigitsNumber
{
    public static void main(String[] args) 
    {
        // Creating a scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user to enter n value
        System.out.print("Enter n value: ");
        int n = sc.nextInt(); //Read Integer input
        int rem = 0, sum = 0;
        int temp = n;

        //  checks condition till n reaches to zero
        while(n!=0)
        {
            rem = n % 10;
            sum = sum + rem; // Perform sum and store result
            n = n / 10;
        }
        n = temp;
        System.out.println("Sum of digits in a number " + n + " is: " + sum);
        // Close scanner object
        sc.close();

    }
}
