//Program to perform PostiveNegativeCheck by taking input from the user.
import java.util.Scanner;// import Scanner class for user input

public class PostiveNegativeCheck
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); // Creating  Scanner object

        // Ask the user to enter a number.
        System.out.println("Enter a number: ");
        int num = sc.nextInt(); // Read an integer from user

        // Check if the number is positive, negative, or zero 
        if(num>0){
            System.out.println(num + " is Positive."); // Number is greater than 0
        }
        else if(num<0){
            System.out.println(num + " is Negative."); // Number is less than 0
        }
        else{
            System.out.println("The number is zero."); // Number is exactly 0
        }

        sc.close(); // Close the Scanner object to prevent resource leak
    }
}