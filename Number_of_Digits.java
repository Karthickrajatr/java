import java.util.*;
public class Number_of_Digits
{
  public static void main(String[] args)
  {
    Scanner ka=new Scanner(System.in);
    int a,b=0;
    a=ka.nextInt();
    while(a!=0)
    {
     a=a/10;
     b=b+1;
    }
    System.out.println(""+b) ;
  }
}