import java.util.*;
public class Sum_of_the_arithmetic {
  public static void main(String[] args) {
  Scanner ka=new Scanner(System.in);
  int a,d;
  float n;
  double x;
  n=ka.nextInt();  
  a=ka.nextInt();
  d=ka.nextInt();
  x=((n / 2) * (2 * a + (n - 1) * d));
  System.out.println(""+x);
  }
}