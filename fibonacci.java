import java.util.*;
class fibonacci
{  
    static int fib(int n) 
    { 
    if (n <= 1) 
       return n; 
    return fib(n-1) + fib(n-2); 
    } 
       
    public static void main (String args[]) 
    { 
      Scanner ka=new Scanner(System.in);
    int n; 
    n=ka.nextInt();
    System.out.println(fib(n)); 
    } 

} 