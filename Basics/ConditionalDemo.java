// ConditionalDemo.java
import java.util.Scanner; // import Scanner class to take input

public class ConditionalDemo {
    public static void main(String[] args) {
        // Creating Scanner object to read input
        Scanner sc = new Scanner(System.in); 

        // Ask user to enter a number
        System.out.println("Enter a number: ");
        int num = sc.nextInt(); // reading input using the object
        
        // If statement
        if(num > 0) // check if greater than zero prints only true statements
        {
            System.out.println(num + " is positive");
        }

        //If-Else statement
        if(num%2 == 0) // checks number is even or not
        {
            System.out.println(num + " is even"); // Number is Even
        }
        else
        {
            System.out.println(num + " is odd"); // Number is odd
        }

        // Switch statement
        System.out.println("Enter a day number (1-7): ");
        int day = sc.nextInt();// Read integer input of a day

        // Take input value and check the condition give matching result
        switch(day){
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturday"); break;
            default: System.out.println("Invalid day number");
        }

        // close the scanner object to prevent resouce leak
        sc.close();
    }
}
