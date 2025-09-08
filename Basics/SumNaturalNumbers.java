// SumNaturalNumbers.java
import java.util.Scanner; // import Scanner class to take input

public class SumNaturalNumbers {
    public static void main(String args[]){
        // Creating Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Ask user to enter number1
        System.out.print("Enter number: ");
        int num = sc.nextInt(); // Read Integer input

        // Declare variable
            int sum = 0;

        // check number starts from 1
        if(num >= 1){
            for(int i=1; i<=num; i=i+1){
                sum = sum + i;
            }
            System.out.print("Sum of Natural numbers from 1 to " + num + " is: " + sum);
        }
        else{
            System.out.println("Enter valid number");
        }
        
        // close the scanner object to prevent resouce leak
        sc.close();
    }
}
