import java.util.*;
public class pyramid
{
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
       System.out.print("Enter the no of rows - ");
       int rows=in.nextInt();
       int i, j, space;
       for(i=1; i<=rows; i++)
       {
           for (space = i; space<rows; space++)
           {
               System.out.print(" ");
           }
           for(j=1; j<=(i*2-1); j++)
           {
               System.out.print("*");
           }
           System.out.println();
       }
    }
}
