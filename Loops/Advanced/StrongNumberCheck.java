// StrongNumberCheck.java

// import Scanner class to read input
import java.util.Scanner;
public class StrongNumberCheck
{
    public static void main(String[] args) 
    {
        // Creating a scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user to enter n value
        System.out.print("Enter n value: ");
        int n = sc.nextInt(); //Read Integer input
        int sum = 0, rem = 0, temp = n;

        while(n!=0) // 145
        {
            rem = n % 10; // 5

            // iterates i to n 
            int fact = 1;
            for(int i=1; i<=rem; i++) //5
            {
                fact = fact * i;
            }
            
            sum = sum + fact;
            n = n / 10;
        }
        n = temp; 

        if(sum == n)
        {
            System.out.println(n + " is a Strong Number");
        }
        else
        {
            System.out.println(n + " is not a Strong Number");
        }

        // Close scanner object
        sc.close();

    }
}
