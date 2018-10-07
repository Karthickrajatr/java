import java.util.Scanner;
public class largest_among_10num
{
    public static void main(String[] args) 
    {
        int n, max;
        n=10;
        Scanner s = new Scanner(System.in);
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        max = a[0];
        for(int i = 0; i < n; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        System.out.println(""+max);
    }
}