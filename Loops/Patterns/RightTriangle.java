/* Right-Angled Triangle
*
**
***
****
***** 
*/
public class RightTriangle
{
    public static void main(String[] args) 
    {
        // Outer loop for printing rows
        for(int i=1;i<=5;i++)
        {
            //Inner loops for printing stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        } 
    }
}
