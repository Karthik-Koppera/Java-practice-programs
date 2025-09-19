// PrimeNthDigit.java

// import Scanner class to read input
import java.util.Scanner;
public class PrimeNthDigit
{
    public static void main(String[] args) 
    {
        // Creating a scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user to enter n value
        System.out.print("Enter Nth value: ");
        int N = sc.nextInt(); //Read Integer input
        int count=0;
        for(int n=1; n<=100; n++)
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
                count+=1;
                System.out.print(n + " ");
                System.out.println();
            }
            
            if(count == N){
                System.out.println("Prime " + N + "th " + "value is " + n);
                break;
            }

        }

        // close scanner object
        sc.close();
    }
}
