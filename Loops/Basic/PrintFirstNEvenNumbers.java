// PrintFirstNEvenNumbers.java

// import Scanner class to read input
import java.util.Scanner;
public class PrintFirstNEvenNumbers 
{    
    public static void main(String[] args) 
    {
        // Creating scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user to enter N value
        System.out.print("Enter N: ");
        int N = sc.nextInt(); // Read Integer input

        // prints even numbers from 1 to N
        for(int i=1; i<=N; i++)
        {
            // check even number
            if(i % 2 == 0){
            System.out.println(i);
            } 
        }
        System.out.println(Integer.MAX_VALUE);
        // close scanner object to prevent resource leak
        sc.close();
    }
}


