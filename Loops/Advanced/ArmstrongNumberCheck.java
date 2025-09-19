// ArmstrongNumberCheck.java

// import Scanner class to read input
import java.util.Scanner;
public class ArmstrongNumberCheck
{
    public static void main(String[] args) 
    {
        // Creating a scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user to enter n value
        System.out.print("Enter n value: ");
        int n = sc.nextInt(); //Read Integer input
        int sum = 0, rem = 0, temp = n;

        while(n!=0)
        {
            rem = n % 10;
            sum = sum + (rem*rem*rem);
            n = n / 10;
        }
        n = temp; 

        if(sum == n)
        {
            System.out.println(n + " is a ArmStrong Number");
        }
        else
        {
            System.out.println(n + " is not a ArmStrong Number");
        }

        // Close scanner object
        sc.close();

    }
}
