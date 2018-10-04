import java.util.*;
public class Sum_of_naturalnumber
{
  public static void main(String[] args)
  {
    Scanner ka=new Scanner(System.in);
    int a,b,c;
    a=ka.nextInt();
    b=0;
    for(c=1;c<=a;++c)
    {
      b+=c;
    }
    System.out.println(""+b);
  }
}