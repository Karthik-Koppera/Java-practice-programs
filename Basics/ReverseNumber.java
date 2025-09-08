// ReverseNumber.java
import java.util.Scanner; // import Scanner class to take input

public class ReverseNumber {
    public static void main(String args[]){
        // Declaring variables.
        int rev = 0, rem = 0;
        // Creating Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Ask user to enter number1
        System.out.print("Enter a number: "); // 7895 --- 5987
        int num = sc.nextInt(); // Read Integer input
        int temp = num;
        while(num > 0){

            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;

        }
        num = temp;
        System.out.println("Reverse of the number " + num + " is " + rev);

        // close the scanner object to prevent resouce leak
        sc.close();
    }
}
