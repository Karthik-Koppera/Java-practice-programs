// PrimeInterval.java

// import Scanner class to read input
import java.util.Scanner;
public class PrimeInterval
{
    public static void main(String[] args) 
    {
        // Creating a scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user to enter  value
        System.out.print("Enter lower and higher interval values: ");
        int low = sc.nextInt(); //Read Integer input
        int high = sc.nextInt(); //Read Integer input

        for(int n=low; n<=high; n++)
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
