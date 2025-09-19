// PrintEvenDigitsInNumber

// import Scanner Class to read input
import java.util.Scanner;

public class PrintEvenDigitsInNumber 
{
    public static void main(String[] args) 
    {
        // Creating a scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user to enter n value
        System.out.println("Enter n value: ");
        int n = sc.nextInt(); //Read Integer input
        int rem = 0;

        //  checks condition till n reaches to zero
        while(n!=0)
        {
            rem = n % 10;
                if(rem % 2 == 0)
                    System.out.println(rem);
            n = n / 10;
        }

        // Close scanner object
        sc.close();
    }
}

