/* InvertedReverseNumberTriangle.java
    5 4 3 2 1
    4 3 2 1
    3 2 1
    2 1
    1
 */
public class InvertedReverseNumberTriangle
{
    public static void main(String[] args) 
    {
       // print rows
       for(int i=5;i>=1;i--)
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
