import java.util.*;
public class polindrome
{
    public static void main(String args[])
    {
        int n, m,a,x;
        a=0;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        m = n;
        while(n > 0)
        {
            x = n % 10;
            a = a * 10 + x;
            n = n / 10;
        }
        if(a == m)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}