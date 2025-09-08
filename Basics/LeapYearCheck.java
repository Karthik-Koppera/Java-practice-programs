// LeapYearCheck.java
import java.util.Scanner; // import Scanner class for user input

public class LeapYearCheck {
    public static void main(String[] args){
        // Creating scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a year
        System.out.println("Enter year: ");
        int year = sc.nextInt(); // Read Integer input

        // Check year is leap or not
        if((year % 4 == 0) && (year % 100!=0 || year % 400 == 0)){
            System.out.println(year + " is a Leap year"); // year is Leap
        }
        else{
            System.out.println(year + " is not a Leap year"); // year is not a Leap
        }

        // close the scanner object to prevent resouce leak
        sc.close(); 
    }
}
