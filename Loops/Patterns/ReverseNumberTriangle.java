/* ReverseNumberTriangle.java
 `  1  
    2 1
    3 2 1
    4 3 2 1
    5 4 3 2 1
 */
public class ReverseNumberTriangle 
{
    public static void main(String[] args) 
    {
       // print rows
       for(int i=1;i<=5;i++)
       {
           // print stars 
           for(int j=i;j>=1;j--)
           {
            System.out.print(j + " ");
           }
        System.out.println();
       }
    }
}
