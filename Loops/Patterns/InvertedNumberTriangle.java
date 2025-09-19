/* Inverted Number Triangle
12345 
1234
123
12
1
 */
public class InvertedNumberTriangle 
{
    public static void main(String[] args) 
    {
       //Outer loop prints rows
       for(int i=5;i>=1;i--)
       {
           //Inner loop prints value
           for(int j=1;j<=i;j++)
           {
            System.out.print(j + " ");
           }
           System.out.println();
       }
    }
}
