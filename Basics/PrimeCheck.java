// PrimeCheck.java
import java.util.Scanner; // import Scanner class to take input

public class PrimeCheck {
    public static void main(String args[]){
        // Declare a variable
        boolean isPrime = true;
        // Creating Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Ask user to enter number1
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Read Integer input

        // for loop for iterating
        for(int i=2; i<num; i++){
            if(num % i == 0){
                System.out.println(num + " is not a prime");
                isPrime = false;
                break;
            }
        }
        // check prime or not
        if(isPrime == true){
            System.out.println(num + " is prime number");
        }

        // close the scanner object to prevent resouce leak
        sc.close();
    }
}
