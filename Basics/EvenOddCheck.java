// EvenOddCheck.java
import java.util.Scanner; // import Scanner class for user input

public class EvenOddCheck
{
    public static void main(String[] args) 
    {
        // Creating scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a num
        System.out.println("Enter a num: ");
        int num = sc.nextInt(); // Read Integer input

        // Checking even or odd
        if(num % 2 == 0){
            System.out.println(num + " is Even"); // number is even
        }
        else{
            System.out.println(num + " is Odd"); // number is odd
        }

        sc.close(); // close scanner object to prevent resource leak
    }
}