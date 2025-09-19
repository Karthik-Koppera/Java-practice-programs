/* HollowSquare.java
    ******
    *    *
    *    *
    *    *
    ******
 */
public class HollowSquare 
{
    public static void main(String[] args) 
    {
        // print rows
        for(int i=1;i<=5;i++)
        {
            // Print stars
            for(int j=1;j<=5;j++)
            {
                if(i==1 || i==5 || j==1 || j==5)
                    System.out.print("*" + " ");
                else 
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
