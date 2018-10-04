import java.util.*;
public class Check_leap_year
{
  public static void main(String[] args)
  {
    Scanner ka=new Scanner(System.in);
    int a;
    a=ka.nextInt();
   if(a%4==0) 
   {
     System.out.println("yes");
   }
   else
   {
     System.out.println("no");
   }
  }
}
