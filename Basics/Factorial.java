// Factorial.java
import java.util.Scanner; // import Scanner class to take input

public class Factorial 
{
    public static void main(String args[]){
        // Creating scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user to enter number
        System.out.print("Enter number: ");
        int num = sc.nextInt(); // Read Integer input

        int fact = 1;

        // for loop to perform factorial
        for(int i=num;i>=1;i--){
            // 5,4,3,2,1
            fact = fact * i;
        }
        System.out.print("Factorial of " + num + " is " + fact);

        // close the scanner object to prevent resouce leak
        sc.close();
    }
}
