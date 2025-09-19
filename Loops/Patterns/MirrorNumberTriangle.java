/* MirrorNumberTriangle.java
1             1     
1 2         2 1
1 2 3     3 2 1
1 2 3 4 4 3 2 1 
 */
public class MirrorNumberTriangle 
{
    public static void main(String[] args) 
    {
        int rows = 4; // change this to increase rows

        // print rows
        for(int i=1;i<=rows;i++)
        {
            // Left side numbers (increasing)
            for(int j=1;j<=i;j++)
            {
                System.out.print(j + " ");
            }
           
            // Spaces in middle
            int n = 2 * (rows - i);
            for(int spaces=1;spaces<=n;spaces++)
            {
                System.out.print("  ");
            }

            // right side numbers (decreasing)
                for(int j=i;j>=1;j--)
                {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
    }
}
