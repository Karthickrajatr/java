import java.util.*;
public class Prime_between_2intervel
 {
    public static void main(String[] args)
 {
Scanner ka=new Scanner(System.in);
        int low, high,i,c=0;
low=ka.nextInt();
high=ka.nextInt();
for(i=2;i<=low/2;i++)
{
if(low%i==0)
{
c=1;
break;
}
}
if(low==1)
{
System.out.println("");
}
else
{
if(c==0)
{
  low=low+1;
        while (low < high) 
        {
            boolean flag = false;

            for(i = 2; i <= low/2; ++i) 
            {               
                if(low % i == 0)
                 {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.print(low + " ");

            ++low;
        }
}
else
{
 while (low < high) 
        {
            boolean flag = false;

            for(i = 2; i <= low/2; ++i) 
            {                
                if(low % i == 0) 
                {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.print(low + " ");

            ++low;
        } 
}
}
    }
}