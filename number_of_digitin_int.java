import java.util.*;
public class number_of_digitin_int
{ 
  public static void main(String args[]) 
  {
    Scanner ka=new Scanner(System.in);
     int n,a=0;
     n=ka.nextInt();
    while(n!=0)
    {
      n=n/10;
      a=a+1;
    }
    System.out.println(""+a);
  }
}
