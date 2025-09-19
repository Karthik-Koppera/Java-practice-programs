// PalindromeNumberCheck.java

// import Scanner class to read input
import java.util.Scanner;
public class PalindromeNumberCheck
{
    public static void main(String[] args) 
    {
        // Creating a scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user to enter n value
        System.out.print("Enter n value: ");
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

        // check palindrome or not
        if(n == rev)
            System.out.println(n + " is a palindrome number");
        else
            System.out.println(n + " is not a palindrome number");

        // Close scanner object
        sc.close();

    }
}
