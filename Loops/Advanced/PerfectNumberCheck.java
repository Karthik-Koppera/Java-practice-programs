// PerfectNumberCheck.java

// import Scanner class to read input
import java.util.Scanner;
public class PerfectNumberCheck
{
    public static void main(String[] args) 
    {
        // Creating a scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user to enter n value
        System.out.print("Enter n value: ");
        int n = sc.nextInt(); //Read Integer input
        int sum = 0;

        // iterates i to n 
        for(int i=1; i<=n/2; i++) 
        {
            if(n % i == 0)
            {
                sum = sum + i;
            }
        }

        if(sum == n)
        {
            System.out.println(n + " is a Perfect Number");
        }
        else
        {
            System.out.println(n + " is not a Perfect Number");
        }
        // Close scanner object
        sc.close();

    }
}
