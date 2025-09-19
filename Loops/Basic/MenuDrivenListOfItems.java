// MenuDrivenListOfItems.java

// import Scanner class to read input
import java.util.Scanner;
public class MenuDrivenListOfItems 
{
    public static void main(String[] args) 
    {
        // Creating scanner object
        Scanner sc = new Scanner(System.in);

        // Repeats over the condition
        while(true)
        {
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Exit");

            System.out.println("Enter your choice: ");
            int ch = sc.nextInt();

            // performs sum
            if(ch == 1)
            {
                System.out.println("Enter 2 numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                System.out.println("Addition: " + (num1 + num2));
            }
            // performs sub
            else if(ch == 2)
            {
                System.out.println("Enter 2 numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                System.out.println("Subtraction: " + (num1 - num2));
            }
            // exit
            else if(ch == 3)
            {
                break;
            }
            else{
                System.out.println("Invalid choice");
            }
        }

        // close scanner object to prevent resource leak
        sc.close();
    }
}
