// CountEvenOdd.java

// import Scanner class to read input
import java.util.Scanner;

public class CountEvenOdd 
{
    public static void main(String[] args) 
    {
        // Creating a scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user to enter N value
        System.out.println("Enter N value: ");
        int N = sc.nextInt(); //Read Integer input
        int even = 0, odd = 0;
        // Iterates i to N value
        for(int i=1; i<=N; i=i+1)
        {
            // Ask user to enter a number
            System.out.println("Enter a Number: " );
            int num = sc.nextInt(); //Read Integer input

            // check even and odd for count
            if(num % 2 == 0)
                even+=1;
            else
                odd+=1;
        }
        System.out.println("Even count = " + even);
        System.out.println("Odd count = " + odd);

        // Close scanner object
        sc.close();

        
    }
}
