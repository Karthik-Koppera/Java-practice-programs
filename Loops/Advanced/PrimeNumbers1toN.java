// PrimeNumbers1toN.java

// import Scanner class to read input
import java.util.Scanner;
public class PrimeNumbers1toN 
{
    public static void main(String[] args) 
    {
        // Creating a scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user to enter n value
        System.out.print("Enter n value: ");
        int num = sc.nextInt(); //Read Integer input

        for(int n=1; n<=num; n++)
        {
            boolean isPrime = true;
            for(int i=2; i<n ;i++)
            {
                if(n % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
            {
                System.out.print(n + " ");
            }
        }

        // close scanner object
        sc.close();
    }
}
