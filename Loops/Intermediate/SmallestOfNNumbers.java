// SmallestOfNNumbers.java

// import Scanner class to read input
import java.util.Scanner;
public class SmallestOfNNumbers
{
    public static void main(String[] args) 
    {
        // Creating a scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user to enter N value
        System.out.println("Enter N value: ");
        int N = sc.nextInt(); //Read Integer input
        int smallest = Integer.MAX_VALUE; //23443534

        // Repeats i to N
        for(int i=1;i<=N;i++)
        {
            System.out.println("Enter a Number: " );
            int num = sc.nextInt(); //Read Integer input

            if(num < smallest)
                smallest = num;
        }
        System.out.println("Smallest Number is: " + smallest); // Print smallest value
   
        // Close scanner object
        sc.close();
    }
}
