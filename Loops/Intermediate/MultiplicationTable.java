// MultiplicationTable.java

// import Scanner class to read input
import java.util.Scanner;
public class  MultiplicationTable
{
    public static void main(String[] args) 
    {
        // Creating a scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user to enter n value
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); //Read Integer input
        
        // Iterates i  to  n
        for(int i=1; i<=10 ;i++)
        {
            System.out.println(n + " X " + i + " = " + n * i);
        }

        
        // Close scanner object
        sc.close();

    }
}
