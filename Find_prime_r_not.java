import java.util.*;
public class Find_prime_r_not
{
    public static void main(String args[])
    {
      Scanner ka=new Scanner(System.in);
        int n,i,c=0;
       n=ka.nextInt();
       for(i=2;i<=n/2;i++)
       {
         if(n%i==0)
         {
           c=1;
           break;
         }
       } 
       if(n==1)
       {
         System.out.println("");
       }
       else
       {
         if(c==0)
         {
          System.out.println("yes"); 
         }
         else
         {
           System.out.println("no");
         }
       }
    }
}