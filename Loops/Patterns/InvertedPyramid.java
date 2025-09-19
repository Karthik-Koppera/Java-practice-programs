/*  InvertedPyramid.java
*******
 *****
  ***
   * 
 */

public class InvertedPyramid 
{
    public static void main(String[] args) 
    {
        // Outer loop for printing rows
        for(int i=4;i>=1;i--)
        {
            //Printing spaces
            for(int space=1;space<=(4-i);space++)
            {
                System.out.print("  ");
            }
            //printing stars
            for(int j=1;j<=(2*i-1);j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
