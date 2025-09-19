// PrintDigitsToTextFormat.java

// import Scanner class to read input
import java.util.Scanner;
public class PrintDigitsToTextFormat
{
    public static void main(String[] args) 
    {
        // Creating a scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user to enter n value
        System.out.print("Enter n value: ");
        int n = sc.nextInt(); //Read Integer input
        int rem = 0, rev = 0, num = 0, rem1 = 0;

        //  checks condition till n reaches to zero --7893
        while(n!=0)
        {
            rem = n % 10;
            rev = rev * 10 + rem; // Perform reverse and store
            n = n / 10;
        }
        // rev -- 3987

         num = rev;

         while(num!=0)
         {
            rem1 = num % 10;
            

            if(rem1 == 1){
                System.out.print("One ");
            }
            else if(rem1 == 2){
                System.out.print("Two ");
            }
            else if(rem1 == 3){
                System.out.print("Three ");
            }
            else if(rem1 == 4){
                System.out.print("Four ");
            }
            else if(rem1 == 5){
                System.out.print("Five ");
            }
            else if(rem1 == 6){
                System.out.print("Six ");
            }
            else if(rem1 == 7){
                System.out.print("Seven ");
            }
            else if(rem1 == 8){
                System.out.print("Eight ");
            }
            else if(rem1 == 9){
                System.out.print("Nine ");
            }
            else{
                System.out.print("Zero ");
            }

            num = num / 10;
         }

        // Close scanner object
        sc.close();

    }
}
