// ScannerInputDemo.java
import java.util.Scanner;// import Scanner class for user input

public class ScannerInputDemo {
    public static void main(String[] args) {
        // Creating Scanner Object to read input
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a name
        System.out.println("Enter your name: ");
        String name = sc.next(); // Read string input

        // Ask user to enter an age
        System.out.println("Enter your age: ");
        int age = sc.nextInt(); // Read integer input

        // Ask user to enter height
        System.out.println("Enter your height: ");
        double height = sc.nextDouble(); // Read double input

        // print the input to the console
        System.out.println("=======My Details=======");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);

        sc.close(); // Close the scanner object to prevent resource leak 
    }
}
