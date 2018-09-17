import java.util.*;
class Find leap 
{
public static void main(String args[])
{
  Scanner ka=new Scanner(System.in);
  int a;
  System.out.println("Enther the year");
a=ka.nextInt();
if(a%4==0)
{
System.out.println("this year is leap year");
}
else
{
  System.out.println("this year is not leap year");
}
}
}