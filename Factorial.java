import java.util.*;
public class Factorial 
{
    public static void main(String[] args)
     {
Scanner ka=new Scanner(System.in);
        int a;
a=ka.nextInt();
        long b = 1;
        for(int i = 1; i <= a; ++i)
        {
            
            b=b*i;
        }
        System.out.printf(""+ b);
  }
}