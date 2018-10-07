import java.util.*;
public class Check_range_1to10
{ 
  public static void main(String args[]) 
  {
    Scanner ka=new Scanner(System.in);
     int n;
     n=ka.nextInt();
     if(n==1||n==2||n==3||n==4||n==5||n==6||n==7||n==8||n==9||n==10)
     {
       System.out.println("yes");
     }
     else
     {
        System.out.println("no");
     }
  }
}

