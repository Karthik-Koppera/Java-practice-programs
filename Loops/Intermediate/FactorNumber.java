// FactorNumber.java

// import Scanner class to read input
import java.util.Scanner;
public class FactorNumber
{
    public static void main(String[] args) 
    {
        // Creating a scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user to enter n value
        System.out.print("Enter n value: ");
        int n = sc.nextInt(); //Read Integer input

        System.out.println("Factors of " + n + " is: ");
        
        // iterates i to n 
        for(int i=1; i<=n; i++) 
        {
            if(n % i == 0)
            {
                System.out.print(i + " ");
            }
        }

        
        // Close scanner object
        sc.close();

    }
}
