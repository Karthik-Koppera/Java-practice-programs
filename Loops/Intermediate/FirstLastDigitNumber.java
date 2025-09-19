// FirstLastDigitNumber.java

// import Scanner class to read input
import java.util.Scanner;
public class FirstLastDigitNumber
{
    public static void main(String[] args) 
    {
        // Creating a scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user to enter n value
        System.out.print("Enter n value: ");
        int n = sc.nextInt(); //Read Integer input -- 4567
        int firstDigit = 2, lastDigit = 0;

        // Last Digit
        lastDigit = n % 10; 

        //  checks condition till n reaches to zero
        while(n>=10) // 4567
        {
            n = n / 10;
        }
        firstDigit = n;
        
        System.out.println("First Digit = " + firstDigit);
        System.out.println("Last Digit = " + lastDigit);

        // Close scanner object
        sc.close();

    }
}
