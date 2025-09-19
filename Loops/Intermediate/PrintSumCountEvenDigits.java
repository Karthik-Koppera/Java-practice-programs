// PrintSumCountEvenDigits.java

import java.util.Scanner;

public class PrintSumCountEvenDigits 
{
    public static void main(String[] args) 
    {
        // Creating a scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user to enter n value
        System.out.print("Enter n value: ");
        int n = sc.nextInt(); //Read Integer input
        int rem = 0, sum = 0, temp = n, count = -1;

        //  checks condition till n reaches to zero
        while(n!=0)
        {
            rem = n % 10;
                if(rem % 2 == 0)
                    sum = sum + rem;
                    count+=1;
            n = n / 10;
        }
        n = temp;
        System.out.println("Count of Even digits: " + count);
        System.out.println("Sum of Even digits in a number " + n + " is: " + sum);


        // Close scanner object
        sc.close();
    }
}
