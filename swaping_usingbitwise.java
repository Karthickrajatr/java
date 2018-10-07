import java.util.*;
public class Main 
{
    public static void main(String args[])
    {
        int m, n;
        Scanner s = new Scanner(System.in);
        m = s.nextInt();
        n = s.nextInt();
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;
        System.out.println("First number:"+m);
        System.out.println("Second number:"+n);
    }
}