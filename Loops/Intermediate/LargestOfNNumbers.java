// LargestOfNNumbers.java

// import Scanner class to read input
import java.util.Scanner;
public class LargestOfNNumbers
{
    public static void main(String[] args) 
    {
        // Creating a scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user to enter N value
        System.out.println("Enter N value: ");
        int N = sc.nextInt(); //Read Integer input
        int largest = Integer.MIN_VALUE;

        // Repeats i to N
        for(int i=1;i<=N;i++)
        {
            System.out.println("Enter a Number: " );
            int num = sc.nextInt(); //Read Integer input

            if(num > largest)
                largest = num;
        }
        System.out.println("Largest Number is: " + largest); // Print largest value
   
        // Close scanner object
        sc.close();
    }
}