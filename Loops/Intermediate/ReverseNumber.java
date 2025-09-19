// ReverseNumber.java

// import Scanner class to read input
import java.util.Scanner;
public class ReverseNumber
{
    public static void main(String[] args) 
    {
        // Creating a scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user to enter n value
        System.out.println("Enter n value: ");
        int n = sc.nextInt(); //Read Integer input
        int rem = 0, rev =0;
        int temp = n;

        //  checks condition till n reaches to zero
        while(n!=0)
        {
            rem = n % 10;
            rev = rev * 10 + rem; // Perform reverse and store
            n = n / 10;
        }
        n = temp;
        System.out.println("Reverse of a Number "+ n +" is: "  + rev);

        // Close scanner object
        sc.close();

    }
}
