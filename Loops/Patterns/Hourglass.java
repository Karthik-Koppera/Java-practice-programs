/*  Hourglass.java
*******
 *****
  ***
   *
  ***
 *****
*******
 */
public class Hourglass 
{
    public static void main(String[] args)
    {
        // print rows
        for(int i=5;i>=1;i--)
        {
            // print spaces
            for(int spaces=1;spaces<=(5-i);spaces++)
            {
                System.out.print(" ");
            }
            //print stars
            for(int j=1;j<=(2*i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        // ------------------------------------------------------
        // print rows
        for(int i=2;i<=5;i++)
        {
            // print spaces
            for(int spaces=1;spaces<=(5-i);spaces++)
            {
                System.out.print(" ");
            }
            //print stars
            for(int j=1;j<=(2*i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
