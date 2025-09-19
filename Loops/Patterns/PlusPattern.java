// PlusPattern.java

public class PlusPattern 
{
    public static void main(String[] args) 
    {
        // print rows
        for(int i=1;i<=9;i++)
        {
            //print stars
            for(int j=1;j<=9;j++)
            {
                if(i==5 || j==5)
                 System.out.print("*" + " ");
                else
                 System.out.print("  ");
            }
         System.out.println();
        }
    }
}
