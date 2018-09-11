import java.util.*;
class Main 
{
  public static void main(String[] args) 
  {
    int a,b,c,d;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first value:");
    a=sc.nextInt();
    System.out.println("Enter the sec value:");
    b=sc.nextInt();
    System.out.println("enter the third value:");
    c=sc.nextInt();
    System.out.println("enter the fourth value:");
    d=sc.nextInt();
    if(a>b&&a>c&&a>d)
{
  System.out.println("first is big");
}
else if(b>a&&b>c&&b>d)
{
  System.out.println("second is big");
}
else if(c>a&&c>b&&c>d)
{
 System.out.println("3rd value is big"); 
}
else
{
  System.out.println("4th value is big");
}
  }

  }