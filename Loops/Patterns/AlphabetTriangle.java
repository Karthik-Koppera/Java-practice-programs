/* AlphabetTriangle.java 
A
A B
A B C
A B C D
*/
public class AlphabetTriangle
{
    public static void main(String[] args) 
    {
        //Outer loop prints rows
       for(char ch='A';ch<='D';ch++)
       {
           //Inner loop prints value
           for(char ch1='A';ch1<=ch;ch1++)
           {
            System.out.print(ch1 + " ");
           }
           System.out.println();
       }
    }
}
