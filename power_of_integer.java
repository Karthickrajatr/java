import java.util.*;
public class power_of_integer {
  public static void main(String[] args) {
   Scanner ka=new Scanner(System.in);
   int a,b;
   long c=1;
   a=ka.nextInt();
   b=ka.nextInt();
  while(b!=0)
  {
    c=c*a;
    --b;
  }
  System.out.println(""+c);
  }
}