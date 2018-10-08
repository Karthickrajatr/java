import java.util.*;
public class average_of_given_n_numbers
{ 
  public static void main(String args[]) 
  {
    Scanner ka=new Scanner(System.in);
     int n,sum=0,c;
     n=ka.nextInt();
   int b[]=new int[n];
   for(int i=0;i<n;++i)
   {
     b[i]=ka.nextInt();
     sum=sum+b[i];
   }
    c=sum/n; 
     System.out.println(""+c);
   }
  }
