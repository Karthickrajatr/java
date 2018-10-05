import java.util.*;
public class odd_between_2intervel
{
    public static void main(String args[])
    {
      Scanner ka=new Scanner(System.in);
        int a,b;
        a=ka.nextInt();
        b=ka.nextInt();
        if(a%2==0)
        {
        while(a<b)
        {
          if(a%2==1)
          {
           System.out.println(""+a); 
          }
          a=a+1;
        }
        }
       else
       {
       a=a+1;
      while(a<b)
        {
          if(a%2==1)
          {
           System.out.println(""+a); 
          }
          a=a+1;
        } 
       } 
    }
}