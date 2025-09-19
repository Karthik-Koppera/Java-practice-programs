/* SwastikPattern.java
        j= 1 2 3 4 5 6 7 8 9
       i=1 *	   * * * * * 
         2 *	   *	
         3 *	   *
         4 *       * 
	     5 * * * * * * * * *        
	     6         *       *
	     7         *       *
	     8	       * 	   * 
         9 * * * * *       *
 */
public class SwastikPattern 
{
    public static void main(String[] args) 
    {
        // print rows
        for(int i=1;i<=9;i++)
        {
            // print stars
            for(int j=1;j<=9;j++)
            {
                if((j==1 && i<=5) || (i==5) || (j==5) || (j==9 && i>=5) || (i==9 && j<=5) || (i==1 && j>=5))
                    System.out.print("*" + " ");
                else
                    System.out.print("  ");
            }
            System.out.println(); 
        }
    }
}
