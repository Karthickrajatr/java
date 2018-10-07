import java.util.*;
public class 5_multiple_print
 {
   public static void main (String [] args)
    {
Scanner ka=new Scanner(System.in);
int a,i,c;
i=1;
a=ka.nextInt();
while(i<=5)
{
  c=a*i;
 System.out.println(""+c);
  ++i;
}
 
   }
}