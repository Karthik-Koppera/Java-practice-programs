import java.util.Scanner; // import Scanner class to take input

public class SumOfDigits 
{
    public static void main(String args[]){
        // Declaring variables.
        int  rem = 0, sum = 0;

        // Creating Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Ask user to enter number1
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Read Integer input
        int temp = num;

        while(num > 0){
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        num = temp;

        System.out.println("Sum of the digits in a number " + num +" is " + sum);
        
        // close the scanner object to prevent resouce leak
        sc.close();
}
}
