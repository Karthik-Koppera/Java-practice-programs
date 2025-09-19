/* Floyd’s Triangle
1
2 3
4 5 6
7 8 9 10 
 */
public class FloydsTriangle 
{
    public static void main(String[] args) 
    {
        int number = 1;
        //Outer loop prints rows
       for(int i=1;i<=4;i++)
       {
           //Inner loop prints value
           for(int j=1;j<=i;j++)
           {
            System.out.print(number + " ");
            number+=1;
           }
           System.out.println();
       }
    }
}
