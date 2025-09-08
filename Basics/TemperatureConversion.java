// TemperatureConversion.java from (Celsius to fahrenheit)
// Formula: F = c x 1.8 + 32

import java.util.Scanner; // import Scanner class for user input

public class TemperatureConversion 
{
    public static void main(String[] args) 
    {
        // creating scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user to enter  temperature in celsius
        System.out.println("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        //Conversion from (Celsius to fahrenheit)
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println(celsius + "°C = "+ fahrenheit + "°F");

        sc.close(); // closing the scanner object
    }
}
