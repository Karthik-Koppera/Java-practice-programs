/* Right-Angled Number Triangle
1
12
123
1234
12345 
 */
public class NumberTriangle 
{
    public static void main(String[] args) 
    {
       //Outer loop prints rows
       for(int i=1;i<=5;i++)
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
