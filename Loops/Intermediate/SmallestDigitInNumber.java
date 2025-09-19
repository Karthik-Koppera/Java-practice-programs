// SmallestDigitInNumber.java

// import Scanner class to read input
import java.util.Scanner;
public class SmallestDigitInNumber
{
    public static void main(String[] args) 
    {
        // Creating a scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user to enter n value
        System.out.println("Enter n value: ");
        int n = sc.nextInt(); //Read Integer input
        int rem = 0, small = 9;
        int temp = n;

        //  checks condition till n reaches to zero
        while(n!=0)
        {
            rem = n % 10;
                if(rem < small)
                    small = rem;
            n = n / 10;
        }
        n = temp;

        System.out.println("Smallest digit in a number is " + small);
        // Close scanner object
        sc.close();

    }
}
