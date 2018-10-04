import java.util.*;
public class Find_biggestvalue_in_threevalue
{
  public static void main(String[] args)
  {
    Scanner ka=new Scanner(System.in);
    int a,b,c;
    a=ka.nextInt();
    b=ka.nextInt();
    c=ka.nextInt();
    if(a>b&&a>c)
    {
      System.out.println(""+a);
    }
    else if(b>a&&b>c)
    {
      System.out.println(""+b);
    }
    else if (c>a&&c>b)
    {
      System.out.println(""+c);
    }
    else
    {
      System.out.println("Both are Same");
    }
  }
}