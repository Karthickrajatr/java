import java.util.*;
class Main {
  public static void main(String[] args) {
    int s,t,u,v;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value 1");
    int a=sc.nextInt();
    System.out.println("Enter the value 2");
    int b=sc.nextInt();
    System.out.println("Enter the value 3");
    int c=sc.nextInt();
    System.out.println("Enter the value 4");
    int d=sc.nextInt();
    System.out.println("Enter the value 5");
    int e=sc.nextInt();
    System.out.println("Enter the value 6");
    int f=sc.nextInt();
    s=a+b+c+d+e+f;
    t=a-b;
    u=c-d;
    v=e-f;
    System.out.println("add:"+s );
    System.out.println("sub1:"+t );
    System.out.println("sub2:"+u );
    System.out.println("sub3:"+v );
  }
}