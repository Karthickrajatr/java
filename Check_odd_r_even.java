import java.util.*;
class Check_odd_r_even{
public static void main(String[] args)
{
  Scanner ka=new Scanner(System.in);
  int a;
a=ka.nextInt();
if(a%2==0)
{
  System.out.println("Even");
}
else if(a%2==1)
{
  System.out.println("Odd");
}
else
{
  System.out.println("invalid");
}
}
}